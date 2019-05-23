package packageNumber2;

public class Main {

	public static void main(String[] args) {
		
		//  A  //
		Employee CarlosGutierrez = new Employee(23456345, "Carlos", "Gutierrez", 25000);
		
		//  B  //
		Employee AnaSanchez = new Employee(34234123, "Ana", "Sanchez", 27500);
		
		//  C  //
		CarlosGutierrez.getDescription();
		AnaSanchez.getDescription();
		
		//  D  //
		CarlosGutierrez.increaseSalary(15);
		System.out.println("The employee's annual salary is:" + CarlosGutierrez.annualSalary());

	}

}
