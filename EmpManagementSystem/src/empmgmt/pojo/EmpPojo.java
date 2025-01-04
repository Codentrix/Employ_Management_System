package empmgmt.pojo;

public class EmpPojo {
		private int empNo;
		private String empName;
		private double empSal;
		private int deptNo;
		public EmpPojo(int empNo, String empName, double empSal, int deptNo) {
			
			this.empNo = empNo;
			this.empName = empName;
			this.empSal = empSal;
			this.deptNo = deptNo;
		}
		public EmpPojo() {
			
		}
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getEmpSal() {
			return empSal;
		}
		public void setEmpSal(double empSal) {
			this.empSal = empSal;
		}
		public int getDeptNo() {
			return deptNo;
		}
		public void setDeptNo(int deptNo) {
			this.deptNo = deptNo;
		}
		@Override
		public String toString() {
			return "EmpPojo [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", deptNo=" + deptNo
					+ "]";
		}
		
		
		
		
}
