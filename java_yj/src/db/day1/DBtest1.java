package db.day1;

import java.sql.*;
import java.util.ArrayList;

import lombok.Data;

public class DBtest1 {
static Statement stmt = null;
static ResultSet rs =null;
static PreparedStatement pstmt = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*mysq : dbms
		 * localhost : 내부 로컬주소 -> 프로그램이 실행되는 서버와 db가 같은 pc 에 있는 경우 
		 * unoiversity : 데이터 베이스명 
		 * */
		   
		 // Connection 객체를 자동완성으로 import할 때는 com.mysql.connection이 아닌
        // java 표준인 java.sql.Connection 클래스를 import해야 한다.
        Connection con = null;

        // 2. 연결하기
        // 드라이버 매니저에게 Connection 객체를 달라고 요청한다.
        // Connection을 얻기 위해 필요한 url 역시, 벤더사마다 다르다.
        // mysql은 "jdbc:mysql://localhost/사용할db이름" 이다.
        String url = "jdbc:mysql://localhost/university";

        // @param  getConnection(url, userName, password);
        // @return Connection
        String id = "root";
        String pw = "dydwls123*";
        ArrayList<Student1> list = null;
        con = connect(url, id, pw); 
           
        try {
			stmt = con.createStatement();
			insertStudent(con, "2022160004", "다길동", 1, "재학", "2022160002");
			
			list = selectAllStudent(con);
			System.out.println(list);
			// 테이블 형태로 저장 객체로 반환
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        connectClose(con);
	}


		public static Connection connect(String url,String id, String pw) {
			Connection con = null;
			try{
		            // 1. 드라이버 로딩
		            // 드라이버 인터페이스를 구현한 클래스를 로딩
		            // mysql, oracle 등 각 벤더사 마다 클래스 이름이 다르다.
		            // mysql은 "com.mysql.jdbc.Driver"이며, 이는 외우는 것이 아니라 구글링하면 된다.
		            // 참고로 이전에 연동했던 jar 파일을 보면 com.mysql.jdbc 패키지에 Driver 라는 클래스가 있다.
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            con = DriverManager.getConnection(url, id, pw);
		            System.out.println("[연결 성공]");
		        }
		        catch(ClassNotFoundException e){
		            System.out.println("[드라이버 로딩 실패]");
		        }
		        catch(SQLException e){
		            System.out.println("[에러: ]" + e);
		        }
			return con;
		
		}
		public static void connectClose(Connection con) {
			 try{
	                if( con != null && !con.isClosed()){
	                    con.close();
	                    System.out.println("[연결해제]");
	                }
	            }
	            catch( SQLException e){
	                e.printStackTrace();
	            }
		}
public static ArrayList<Student1> selectAllStudent(Connection con)throws SQLException{
	String sql = "select st_num, st_name, st_semester, st_state, st_pr_num from student";
	rs =stmt.executeQuery(sql); 
	ArrayList<Student1> list = new ArrayList<Student1>();
	while (rs.next()) {
		// 반복문 다음요소가 있는지 확인 
		String st_num = rs.getString(1);
		String st_name = rs.getString(2);
		int se_semester = rs.getInt(3);
		String st_state = rs.getString(4);
		String st_pr_num = rs.getString(5);
		Student1 std = new Student1(st_num ,st_name,se_semester,st_state, st_pr_num);
		list.add(std);
	}
	return list;
}

public static void insertStudent(Connection con,
		String st_num, String st_name, 
		int st_semester, String st_state, String st_pr_num) throws SQLException{
	String sql = "insert into student(st_num, st_name, st_semester, "+
			"st_state, st_pr_num) values(?, ?, ?, ?, ?)";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, st_num);
	pstmt.setString(2, st_name);
	pstmt.setInt(3, st_semester);
	pstmt.setString(4, st_state);
	pstmt.setString(5, st_pr_num);
		int count = pstmt.executeUpdate(); // 실행했을때 결과 개수 
		if(count == 0) {
			System.out.println("[추가 실패]");
		}else {
			System.out.println("[추가 성공]");
		}
	}
}
@Data
class Student1{
	private String st_num;
	private String st_name;
	private int st_semester;
	private String st_state;
	private String st_pr_num;
	
	public Student1(String st_num, String st_name, int st_semester, String st_state, String st_pr_num) {
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_semester = st_semester;
		this.st_state = st_state;
		this.st_pr_num = st_pr_num;
	}
	
}
