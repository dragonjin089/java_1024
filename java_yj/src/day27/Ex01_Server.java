package day27;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Ex01_Server {

	private static ArrayList<Client> clientList = new ArrayList<Client>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket serverSocket = null;
		
		try {
			//객체 생성
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress(5001));
			System.out.println("[서버 시작]");
			
			while(true) {
				
				Socket socket = serverSocket.accept();
				Client client =(new Client(socket));
				client.recieve();
				clientList.add(client);
				System.out.println("[클라이언트 접속 ] - 현재 접속인원 : "+ clientList.size());
			}
		}catch(Exception e){
			System.out.println("예외발생 : 서버종료 ");
		}
	}
// 내부클래스
	static class Client {

		private Socket socket;
		
		public Client(Socket socket) {
			this.socket = socket;
	}
		public void recieve() {
			Thread t =new Thread(()->{
				InputStream is = null;
				try {
					byte [] bytes = new byte[1024]; //1024 한번에 읽어오는 바이트 최대개수
					is = socket.getInputStream(); // 연결된 소켓을 통해 읽어옴
					//read() : 1 바이트를 읽어와서 정수로 알려줌 
					//read(byte[] bytes) : bytes크기만큼 한번에 읽어오고 읽어온 개수를 저장
					//bytes 배열에 저장하고 읽어온 개수를 정수로 알려줌
					while(true) {
						
						int readCount = is.read(bytes); // 읽어온 개수 
						//byte[] 에 있는 byte들을 문자열로 변환, 0번지로부터 
						//readCount 개수만큼 변환하는데 인코딩은 utf-8
						if(readCount == - 1) {
							break;
						}
						String str = new String(bytes,0, readCount,"UTF-8");
						//다른 클라이언트들에게 str전송
						if(clientList.size()==0) {
							continue;
						}
						for(Client tmp : clientList) {
							tmp.send(str);
						}
					}
					is.close();
				
				}catch(Exception e) {
//					e.printStackTrace();
				}finally {
				
					// 00000읽기 위해서 대기하다 예외가 발생하면 socket 닫아줌
					// 클라이언트에서 접속을 종료함 
					try {
						if(socket != null && !socket.isClosed())
						socket.close();
						// 클라잉너트 리스트에서 접속 종료한 클라이언트를 제거 
						clientList.remove(this);
						System.out.println("[클라이언트 접속 ] - 현재 접속인원 : "+ clientList.size());
					} catch (Exception e2) {
						System.out.println("클라이언트 소켓 닫기 실패");
					}
				
				}
			});
			t.start();
		}
	public void send(String data) {
		Thread t = new Thread(() ->{
			OutputStream os = null;
			try {
				os = socket.getOutputStream();
				byte []bytes = data.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
			}catch(Exception e) {
				System.out.println("서버 예외발생");
			}
			
		});
		t.start();
	}
	
	
	}
	
	
	
}
