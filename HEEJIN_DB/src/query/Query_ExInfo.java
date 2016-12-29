package query;

public class Query_ExInfo {
	private String insertExInfo = "INSERT EX_INFO (EXNO, PID, EXDATE, LOC, CONTENT) VALUES (?,?,?,?,?)";
	private String selectExInfo = "SELECT EXNO, PID, EXDATE, LOC, CONTENT FROM EX_INFO WHERE PID=?";
	private String updateExInfo = "UPDATE EX_INFO SET EXDATE=?, LOC=?, CONTENT=? WHERE PID = ?";
	public String getInsertExInfo () {
		return insertExInfo ;
	}
	
	public String getselectExInfo() {
		return selectExInfo;
	}
	public String getUpdateExInfo() {
		return updateExInfo;
	}

}
