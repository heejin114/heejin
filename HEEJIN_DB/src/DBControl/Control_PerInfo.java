package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import query.Query_PerInfo;

public class Control_PerInfo {
	
	Query_PerInfo queryPI = new Query_PerInfo(); 
	
	
	public void InsertPerInfo(Connection conn, String value1, String value2, 
			String value3, String value4, String value5){
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(queryPI.getInsertPerINFO());
			pstmt.setString(1, value1);
			pstmt.setString(2, value2);
			pstmt.setString(3, value3);
			pstmt.setString(4, value4);
			pstmt.setString(5, value5);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet SelectEmpInfo(Connection conn,String value){
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		try {
			pstmt = conn.prepareStatement(queryPI.getselectPerInfo());
			pstmt.setString(1, value);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String pname = rs.getString("PNAME");
				String loc =rs.getString("LOC");
				String email = rs.getString("EMAIL");
				
				System.out.println("이름 : " + pname + "\t 주소 : " + loc + "\t 이메일 : " + email );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void UpdatePerInfo(Connection conn,String pname, String loc, String email,
			String birth, String pid){
		PreparedStatement pstmt = null;
		try {
			pstmt=conn.prepareStatement(queryPI.getUpdatePerInfo());
			pstmt.setString(1, pname);
			pstmt.setString(2, loc);
			pstmt.setString(3, email);
			pstmt.setString(4, birth);
			pstmt.setString(5, pid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
