package day27;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import day27.Ex01_Server.Client;

public class Ex01_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket =null;
		try {
			socket = new Socket();
			System.out.println("연결시도중");
			socket.connect(new InetSocketAddress("192.168.10.6",5001));
			System.out.println("연결 성공");
			send(socket,"학생");
			recieve(socket);
		}catch(Exception e){
			System.out.println("연결 실패");
		}
		
		
	}
	public static void recieve(Socket socket) {
		Thread t =new Thread(()->{
			InputStream is = null;
			try {
				byte [] bytes = new byte[1024]; //1024 한번에 읽어오는 바이트 최대개수
				is = socket.getInputStream(); // 연결된 소켓을 통해 읽어옴
				
				while(true) {
					
					int readCount = is.read(bytes); // 읽어온 개수 
					
					if(readCount == - 1) {
						break;
					}
					String str = new String(bytes,0, readCount,"UTF-8");
					int index = str.indexOf(",");// send ,
					if(index == -1)
						continue;
					
					String name = str.substring(0, index);
					String message= str.substring(index+1);
					System.out.println(name + ">" + message);
				}
				is.close();
			
			}catch(Exception e) {
				
			}finally {
				
				try {
					if(socket != null && !socket.isClosed())
					socket.close();
					// 클라이언트 리스트에서 접속 종료한 클라이언트를 제거 
				System.out.println("클라이언트 종료");
				} catch (Exception e2) {
					System.out.println("클라이언트 소켓 닫기 실패");
				}
			}
		});
		t.start();
	}
	public static void send(Socket socket,String name) {
		Thread t = new Thread(()->{
			Scanner scan = new Scanner(System.in);
			try {
				
				OutputStream os = socket.getOutputStream();
				while(true) {
					String str = scan.nextLine();
					if(str.equals("exit")) {
						if(socket != null && !socket.isClosed())
						socket.close();
					os.close();
					break;
					
					}
					str =name + "," + str;
					byte [] bytes = str.getBytes("UTF-8");
					
					os.write(bytes);
					os.flush();
				}
				
			} catch (Exception e) {
				
			}finally {
				System.out.println("종료");
				try {
					if(socket != null && !socket.isClosed())
						socket.close();
				}catch(Exception e) {
					System.out.println("클라이언트 소켓 종료 실패");
				}
			}
		});
		t.start();
	}
}
