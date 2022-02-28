package project;

public class Doctor extends Hospital {
	String specialist;

	public Doctor(int id, String name, String address, double pno, String specialist) {
		super(id, name, address, pno);
		this.specialist = specialist;
	}

	public void Qualification() {
		System.out.println("Doctor specialist : " + specialist);
	}

}
