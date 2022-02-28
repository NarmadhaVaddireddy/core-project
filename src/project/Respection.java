package project;

public class Respection extends Hospital{
float time;
double amount;
public Respection(int id, String name, String address, double pno,float time,double amount) {
	super(id, name, address, pno);
	this.time=time;
	this.amount=amount;
}
public void GiveAppointment() {
	System.out.println("Appointment time : "+time);
}
public void GenerateBill() {
	System.out.println("Bill : "+amount);
}
}
