package test;

import java.sql.Connection;

import connect.OracleConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

import DBControl.Control_PerInfo;
import DBControl.Contorl_ExInfo;

public class DB_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OracleConnect oraConn = new OracleConnect();
		
		Connection conn = oraConn.connect();	
		if ( conn != null) System.out.println("Oracle Connect Success");
		else System.out.println("Oracle Connect Fail");
		
		Control_PerInfo cp = new Control_PerInfo();
		cp.SelectEmpInfo(conn, "heejin");
		Contorl_ExInfo ce = new Contorl_ExInfo();
		ce.InsertExInfo(conn, value1, value2, value3, value4, value5);
		
	}

}
