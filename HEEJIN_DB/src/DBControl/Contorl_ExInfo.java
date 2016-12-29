package DBControl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import query.Query_ExInfo;

public class Contorl_ExInfo {
	
	Query_ExInfo queryEI = new Query_ExInfo();
	public void InsertExInfo(Connection conn, String value1, String value2, 
			String value3, String value4, String value5){
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement(queryEI.getInsertExInfo());
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
	
	public ResultSet SelectExInfo(Connection conn,String value){
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		try {
			pstmt = conn.prepareStatement(queryEI.getselectExInfo());
			pstmt.setString(1, value);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String date = rs.getString("EXDATE");
				String loc =rs.getString("LOC");
				String content = rs.getString("CONTENT");
				
				System.out.println("날짜 : " + date + "\t 주소 : " + loc + "\t 내용 : " + content );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void UpdateExInfo(Connection conn,String date, String loc, String content,
			String pid){
		PreparedStatement pstmt = null;
		try {
			pstmt=conn.prepareStatement(queryEI.getUpdateExInfo());
			pstmt.setString(1, date);
			pstmt.setString(2, loc);
			pstmt.setString(3, content);
			pstmt.setString(4, pid);
	
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
