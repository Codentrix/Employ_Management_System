package empmgmt.app;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import empmgmt.dao.EmpDao;
import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;

public class EmpManagement {
	static Scanner kb=new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice;
		do {
			System.out.println("Select an operation");
			System.out.println("1.Add\n2.Search\n3.View All\n4.Update\n5.Delete\n6.Quit");
			choice=kb.nextInt();
			switch(choice) {
			case 1:
					addEmp();
					break;
			case 2:
					searchEmp();
					break;
			case 3:
					viewAll();
					break;
			case 4:
					updateEmp();
					break;
			case 5:
					deleteEmp();
					break;
			case 6:
				System.out.println("Thank you for using the app!");
				DBConnection.closeConnection();
			default:
					System.out.println("Wrong choice ! Try again");
					
			}
		}while(choice!=6);
	}

	private static void deleteEmp() {
		// TODO Auto-generated method stub
		
	}

	private static void updateEmp() {
		// TODO Auto-generated method stub
		
	}

	private static void viewAll() {
		try {
			List<EmpPojo>empList=EmpDao.getAllEmp();
			if(empList.isEmpty()) {
				System.out.println("No emp in the DB");
			}else {
				for(EmpPojo emp:empList) {
					System.out.println(emp);
				}
			}
		}catch(SQLException ex) {
			System.out.println("Exception in adding rec:"+ex);
		}
		
	}

	private static void searchEmp() {
		
		
	}

	private static void addEmp() {
		int eno,dno;
		double sal;
		String name;
		System.out.print("Enter employee no:");
		eno=kb.nextInt();
		System.out.print("Enter employee name:");
		name=kb.next();
		System.out.print("Enter employee sal:");
		sal=kb.nextDouble();
		System.out.print("Enter employee dept no:");
		dno=kb.nextInt();
		EmpPojo emp=new EmpPojo(eno,name,sal,dno);
		try {
			boolean result=EmpDao.addEmp(emp);
			if(result) {
				System.out.println("Recortd added successfully!");
			}
			else {
				System.out.println("Could not add the record");
					
				
			}
		}catch(SQLException ex) {
			System.out.println("Exception in adding rec:"+ex);
		}
		
	}

}
