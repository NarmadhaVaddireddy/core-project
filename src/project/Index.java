package project;

public class Index {

	public static void main(String[] args) {
		Patient p= new Patient(1, "qw", "hyd",1234567891, "heart");
		p.CheckUp();
		Doctor d=new Doctor(2, "wq", "hyd", 12345326, "Cardiologists");
		d.Qualification();
		Respection r=new Respection(2, "qw", "hyd", 234567890, 10.10f, 10000);
		r.GiveAppointment();
		r.GenerateBill();
		}
	}
