package project;

public class Patient extends Hospital{
String problem;
	public Patient(int id, String name, String address, double pno,String problem) {
		super(id, name, address, pno);
		this.problem=problem;
	}
	public void CheckUp() {
		System.out.println("patient problem : "+problem);
	}

}
