package Guia3BisEjercicio4;

public class MainEj4 {

	public static void main(String[] args) {

		Time miTime=new Time(0,0,0);
		System.out.println("[Time] "+miTime.printTime());
		miTime.backASecond();
		System.out.println("[Time] "+miTime.printTime());
		miTime.advanceASecond();
		System.out.println("[Time] "+miTime.printTime());
	}
}
