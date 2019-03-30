import java.util.Scanner;

public class Ejercicio24 {

    public static void Menu(){

        Scanner scan=new Scanner(System.in);
        String nombre;
        int edad=0;
        float salario=0;
        boolean condicion=true;

        System.out.println("Ingrese el nombre: ");
        nombre=scan.nextLine();
        while (condicion) {
            System.out.println("Ingrese la edad: ");
            edad = scan.nextInt();
            if(edad>1) {
                while (condicion) {
                    System.out.println("Ingrese el salario: ");
                    salario = scan.nextFloat();
                    if (salario > 0) {

                        if (edad <= 16) {
                            System.out.println("No tiene edad para trabajar.");
                        }
                        if ((edad > 16) && (edad < 19)) {
                            System.out.println("Salario: " + salario);
                        }
                        if ((edad >= 19) && (edad <= 50)) {
                            salario = Calcular_Salario(salario, 5);
                            System.out.println("Salario: " + salario);
                        }
                        if ((edad > 50) && (edad <= 60)) {
                            salario = Calcular_Salario(salario, 10);
                            System.out.println("Salario: " + salario);
                        }
                        if (edad > 60) {
                            salario = Calcular_Salario(salario, 15);
                            System.out.println("Salario: " + salario);
                        }
                        condicion = false;
                    } else {
                        System.out.println("El salario es incorrecto, intentelo nuevamente");
                    }
                }
            }
            else{
                System.out.println("La edad es incorrecta, intentelo nuevamente");
            }

        }

    }

    public static float Calcular_Salario(float salario,int porcentaje){
        float rta= salario+((salario/100)*porcentaje);
        return rta;
    }

}
