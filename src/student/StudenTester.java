package student;
//CLASE TESTER

public class StudenTester {
	public static void main(String []args) {
		Student Alumno = new Student();
		
		System.out.println(Alumno);
		
		Alumno.setStudentId(503);
		Alumno.setName("Walter");
		Alumno.setSsn("00143023");
		Alumno.setGpa(9.00);
		
		//System.out.println(Alumno);
		Alumno.toString();
		
	}
}
