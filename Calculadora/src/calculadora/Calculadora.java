package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("----------Menu--------------");
            System.out.println("Seleccione un número para la operación que desea realizar: ");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. limpiar");
            System.out.println("6. salir");

            opcion = entrada.nextInt();

            if (opcion <= 4) {
                System.out.println("Ingrese un número: ");
                double num1 = entrada.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double num2 = entrada.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("La suma es: " + sumar(num1, num2));
                        break;

                    case 2:
                        System.out.println("La resta es: " + restar(num1, num2));
                        break;

                    case 3:
                        System.out.println("La multiplicación es: " + multiplicar(num1, num2));
                        break;

                    case 4:
                        System.out.println("La división es: " + dividir(num1, num2));
                        break;

                    case 5:
                        num1 = 0;
                        num2 = 0;
                        opcion = 0;
                        break;

                    case 6:
                        opcion = 6;
                        System.out.println("Operacion finalizada");
                        break;

                    default:
                        System.out.println("Esa opción no es válida. Intente nuevamente.");
                        break;
                }
            }
        }
    }

    static double sumar(double unNumero, double otroNumero) {

        return unNumero + otroNumero;
    }

    static double restar(double unNumero, double otroNumero) {

        return unNumero - otroNumero;
    }

    static double multiplicar(double unNumero, double otroNumero) {

        return unNumero * otroNumero;
    }

    static double dividir(double unNumero, double otroNumero) {

        return unNumero / otroNumero;

    }
}
