package student;

import java.util.Scanner;

public class StudentPoli {
		private int studentId;
		private String fname;
		private String iname;
		private String status;
		
		public final int SCHCODE = 34958;
		
		StudentPoli(int Id, String iname, String fname, String status){
			this.studentId = Id;
			this.iname = iname;
			this.fname = fname;
			this.status = status;
		}
		
		//GETTERS AND SETTERS
		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId 
					+ ", iname=" + iname + ", fname=" + fname 
					+ ", status=" + status + "]";
		}

}
