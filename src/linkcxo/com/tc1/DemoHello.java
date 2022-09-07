package linkcxo.com.tc1;

public class DemoHello {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		One o1=new One();
		o1.bangalore();
		o1.chennai();
		Two t1=new Two();
		t1.mumbai();
		
	}

}
class One{
	public void bangalore() {
		System.out.println("this is Bangalore");
	
	}
	public void chennai() {
		System.out.println("this is Chennai");
		
	}
}
class Two{
	public void mumbai() {
		System.out.println("this is mumbai");
	}
}