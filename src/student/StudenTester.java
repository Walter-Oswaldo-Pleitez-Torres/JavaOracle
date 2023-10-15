package student;
//CLASE TESTER

public class StudenTester {
	public static void main(String []args) {
		Student Alumno = new Student();
		Student Alumno2 = new Student();
		
		System.out.println(Alumno);
		
		Alumno.setStudentId(503);
		Alumno.setName("Walter");
		Alumno.setSsn("00143023");
		Alumno.setGpa(9.00);
		
		System.out.println(Alumno);
		//Alumno.toString();
		
		StudentPoli Estudiante = new StudentPoli(123456789, "Lisa", "Palombo", "Activo");
		System.out.println(Estudiante.toString());
		
		
	}
}
