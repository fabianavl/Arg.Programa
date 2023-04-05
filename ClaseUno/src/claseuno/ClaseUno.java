package claseuno;



public class ClaseUno {

    
    public static void main(String[] args) {
        
        //Punto1:
        //a:
        int a = 5;
        int b = 14;
        System.out.println("Punto a:");
        while(a <= b) {
            System.out.print(a + "-");
            a++;
        }
        
        //b:
        int numA = 5;
        int numB = 14;
        System.out.println("\nPunto b:");
        while(numA <= numB) {
            if(numA % 2 == 0) {
                System.out.print(numA + "-");
            }
            numA++;
        }
        
        
        //c:
        boolean pares = false;
        int numInicio = 5, numFinal = 14;
        
        System.out.println("\nPunto c:");
        
        while (numFinal >=  numInicio) {
            if (pares == true) {
                if (numFinal %2 == 0) {
                    System.out.print(numFinal + "-");
                }
            }else if(numFinal %2 != 0){
                System.out.print(numFinal + "-");
            }	
            numFinal--;
        }
        
        //d:
       // int numInicio = 5, numFinal = 14;
        System.out.println("\nPunto d:");
        for(int i = 14; i >= 5; i--) {
            if(i % 2 == 0) {
                System.out.print(i + "-");
            }
        }
        
        //Punto 2:
        System.out.println("\nPunto 2:");
        double sueldo = 485.32;
        int vehiculos = 4;
        int inmuebles = 2;
        boolean titular = true;
        
        if(sueldo >= 489083 && vehiculos >= 3 && inmuebles >= 3 && titular == true ) {
            System.out.println("Usted pertenece al segmento de ingresos altos");
        }
        else {
            System.out.println("Usted no pertenece al segmento de ingresos altos");
        } 
    
    }
    
}
