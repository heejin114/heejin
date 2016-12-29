package query;

public class Query_PerInfo {

	private String insertPerINFO = "INSERT INTO PER_INFO (PID, PNAME, LOC, EMAIL, BIRTH) VALUES (?,?,?,?,?)";
	private String selectPerInfo = "SELECT PID, PNAME, LOC, EMAIL, BIRTH FROM PER_INFO WHERE PID=?";
	private String updatePerInfo = "UPDATE PER_INFO SET PNAME = ?, LOC = ?,EMAIL=?,BIRTH=? WHERE PID = ?";
	public String getInsertPerINFO () {
		return insertPerINFO ;
	}
	
	public String getselectPerInfo() {
		return selectPerInfo;
	}
	public String getUpdatePerInfo() {
		return updatePerInfo;
	}
}
