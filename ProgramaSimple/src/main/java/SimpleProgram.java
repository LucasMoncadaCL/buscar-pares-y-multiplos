import java.util.Scanner;

public class SimpleProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingrese un nuimero");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("tu numero es par");
        } else {
            System.out.println("tu numero es impar");
        }

        if (numero % 3 == 0 && numero % 4 == 0) {
            System.out.println("tu numero es multiplo de 3 y 4");
        } else if (numero % 3 == 0) {
            System.out.println("tu numeroe s multiplo de 3");
        } else if (numero % 4 == 0) {
            System.out.println("tu numeroe s multiplo de 4");
        }
    }
}