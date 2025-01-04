package empmgmt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;

public class EmpDao {
	
	public static boolean addEmp(EmpPojo emp)throws SQLException {
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Insert into emp values(?,?,?,?)");
		ps.setInt(1, emp.getEmpNo());
		ps.setString(2, emp.getEmpName());
		ps.setDouble(3, emp.getEmpSal());
		ps.setInt(4, emp.getDeptNo());
		return (ps.executeUpdate()==1);		
		
	}
	public static EmpPojo searchEmp(int empId)throws SQLException{
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from emp where empno=?");
		ps.setInt(1, empId);
		ResultSet rs=ps.executeQuery();
		EmpPojo emp=null;
		if(rs.next()) {
			emp=new EmpPojo();
			emp.setEmpNo(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setDeptNo(rs.getInt(4));
			emp.setEmpSal(rs.getDouble(3));
		}
		return emp;
		
	}
	public static List<EmpPojo> getAllEmp()throws SQLException{
		Connection conn=DBConnection.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from emp");
		List<EmpPojo>empList=new ArrayList<EmpPojo>();
		while(rs.next()) {
			EmpPojo emp=new EmpPojo();
			emp.setEmpNo(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setDeptNo(rs.getInt(4));
			emp.setEmpSal(rs.getDouble(3));
			empList.add(emp);
		}
		return empList;
	}
	public static boolean updateEmp(int empId,EmpPojo emp)throws SQLException{
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Update emp set ename=?,sal=?,deptno=? where empno=?");
		ps.setString(1, emp.getEmpName());
		ps.setDouble(2, emp.getEmpSal());
		ps.setInt(3, emp.getDeptNo());
		ps.setInt(4, empId);
		return (ps.executeUpdate()==1);		
	}
	public static boolean deleteEmp(int empId)throws SQLException{
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement("Delete from emp where empno=?");
		ps.setInt(1, empId);
		return (ps.executeUpdate()==1);		
	}

}
