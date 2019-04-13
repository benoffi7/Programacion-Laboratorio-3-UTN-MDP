package e4;

public class Main
{
	public static void main(String[] args)
	{
		Time time1 = new Time(0,17,59);
		System.out.println("[TIME] " + time1.getTime());
		time1.advanceOneSecond();
		System.out.println("[TIME] " + time1.getTime());
		time1.backOneSecond();
		System.out.println("[TIME] " + time1.getTime());
	}
}