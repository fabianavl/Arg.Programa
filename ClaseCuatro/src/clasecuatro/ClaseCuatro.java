package clasecuatro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ClaseCuatro {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println("Punto 1.a:");
        //Punto 1:
        //a:
        int vector[] = {25, 900, 45};
        int n1 = vector[0];
        int n2 = vector[1];
        int n3 = vector[2];
        char letra = 'a'; //representa el ascendente; cambiar si quiere ver el descendente
        ordenar(n1, n2, n3, ' ');

        System.out.println("\nPunto 1.b:");
        //b:
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int vectorInput[] = new int[3];
        vectorInput[0] = numero.nextInt();
        System.out.println("Ingrese un número");
        vectorInput[1] = numero.nextInt();
        System.out.println("Ingrese un número");
        vectorInput[2] = numero.nextInt();
        System.out.println("Ingrese \"a\" si desea ver en forma ascendente o \"d\" para descendente");
        char caracter = numero.next().charAt(0);
        ordenar(vectorInput[0], vectorInput[1], vectorInput[2], caracter);
        numero.close();

        System.out.println("\nPunto 1.c:");
        //c:
        int numA = 75;
        int numB = 892;
        int numC = 23;
        char asc = 'a';
        tieneParametro(numA, numB, numC, asc);

        System.out.println("\nPunto 2.a:");
        //Punto 2.a: 
        String ruta = "C:\\Users\\fabia\\OneDrive\\Escritorio\\Arg. Programa\\Clase 4\\file-numeros.txt";
        for (String linea : Files.readAllLines(Paths.get(ruta))) {
            System.out.println("Los números del archivo son: "+linea);
        }
        
        File archivo = new File("C:\\Users\\fabia\\OneDrive\\Escritorio\\Arg. Programa\\Clase 4\\file-numeros.txt");
        String operacion = " ";
        int resultado = sumarOMultiplicar(archivo, operacion);
        System.out.println("\nEl resultado es " + resultado);

        System.out.println("Punto 3:");
        //Punto 3:
        Path pathRuta = Paths.get("C:\\Users\\fabia\\OneDrive\\Escritorio\\Arg. Programa\\Clase 4\\nombres.txt");

        List<String> ContenidoArchivo = Files.readAllLines(pathRuta, StandardCharsets.UTF_8);
        ContenidoArchivo.forEach(line -> System.out.println(line));
    }

    private static void ordenar(int num1, int num2, int num3, char letra) {

        int aux1 = 0, aux2 = 0, numMayor = 0;

        if ((num1 > num2) && (num1 > num3)) {
            numMayor = num1;
            if (num2 > num3) {
                aux1 = num2;
                aux2 = num3;
            } else {
                aux1 = num3;
                aux2 = num2;
            }
        } else if ((num2 > num3) && (num2 > num1)) {
            numMayor = num2;
            if (num1 > num3) {
                aux1 = num1;
                aux2 = num3;
            } else {
                aux1 = num3;
                aux2 = num1;
            }
        } else {
            numMayor = num3;
            if (num2 > num1) {
                aux1 = num2;
                aux2 = num1;
            } else {
                aux1 = num1;
                aux2 = num2;
            }
        }

        int orden[] = new int[3];

        if (letra == 'a') {
            orden[0] = aux2;
            orden[1] = aux1;
            orden[2] = numMayor;
        } else {
            orden[0] = numMayor;
            orden[1] = aux1;
            orden[2] = aux2;
        }

        for (int i = 0; i < orden.length; i++) {
            System.out.print(orden[i] + "-");
        }
    }

    private static void tieneParametro(int a, int b, int c, char d) {

        if ((a == 0) && (b == 0) && (c == 0)) {
            Scanner numero = new Scanner(System.in);
            System.out.println("Ingrese un número");
            int v[] = new int[3];
            v[0] = numero.nextInt();
            System.out.println("Ingrese un número");
            v[1] = numero.nextInt();
            System.out.println("Ingrese un número");
            v[2] = numero.nextInt();
            System.out.println("Ingrese \"a\" si desea ver en forma ascendente o \"d\" para descendente");
            char letraCaracter = numero.next().charAt(0);
            ordenar(v[0], v[1], v[2], letraCaracter);
            numero.close();
        } else {
            ordenar(a, b, c, d);
        }
    }

    //punto 2: 
    private static int sumarOMultiplicar(File archivo, String operacion) throws FileNotFoundException {
        int resultadoMultiplicar = 0, resultadoSuma = 0;
        boolean input = true;

        Scanner fileNumeros = new Scanner(archivo);

        if (operacion.equalsIgnoreCase("suma")) {
            System.out.println("Esto es suma");
            while (fileNumeros.hasNextInt()) {
                resultadoSuma += fileNumeros.nextInt();
            }
            return resultadoSuma;
        } else {
            System.out.println("Esto es multiplicacion");
            while (fileNumeros.hasNextInt()) {
                if (input) {
                    resultadoMultiplicar = fileNumeros.nextInt();
                    input = false;
                } else {
                    resultadoMultiplicar *= fileNumeros.nextInt();
                }
            }
            return resultadoMultiplicar;
        }
    }

}
