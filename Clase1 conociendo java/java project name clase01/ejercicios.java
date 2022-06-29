import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        ejercicio7();
    }
    private static void ejercicio1() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese el nombre: ");
        var nombre = sc.nextLine();
        sc.close();
        System.out.printf("hola %s como estas!!!", nombre);
    }

    private static void ejercicio2() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        var numero = sc.nextInt();
        sc.close();
        
        if (numero >= 0 && numero <10) {
            System.out.println("el numero tiene un digito");
        } 
        else if (numero >=10 && numero <100) {
            System.out.println("el numero tiene dos digitos");
        }
        else if (numero >=100 && numero <1000) {
            System.out.println("el numero tiene tres digitos");
        } else {
            System.out.println("el numero tiene cuatro o mas digitos");
        }
    }

    private static void ejercicio3() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        var numero = sc.nextInt();
        sc.close();

        var doble= numero * 2;
        var triple = numero * 3;
        System.out.println("el doble del numero es " + doble + " y el triple del numero es " + triple);
    }

    private static void ejercicio4() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese la temperatura en gradeos celsius: ");
        var temperatura = sc.nextFloat();
        sc.close();

        var grados = 32 + ((9*temperatura) / 5);
        System.out.printf("la temperatura en grados fahrenheit son: %.2f", grados);
    }
    
    private static void ejercicio5() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        var numero = sc.nextInt();
        sc.close();

        var resultado = (numero % 2 == 0) ? "el numero es par": "el numero es impar";

        System.out.println(resultado);
    }

    private static void ejercicio6() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese el primer numero: ");
        var numero1 = sc.nextInt();
        System.out.print("ingrese el segundo numero: ");
        var numero2 = sc.nextInt();
        sc.close();
        
        var operacion1 = "suma";
        var suma = numero1 + numero2;
        System.out.println("la " + operacion1+ " de " + numero1 + " y de " + numero2 + " es igual a " + suma);

        var operacion2 = "resta";
        var resta = numero1 - numero2;
        System.out.println("la " + operacion2+ " de " + numero1 + " y de " + numero2 + " es igual a " + resta);

        var operacion3 = "multiplicacion";
        var multiplicacion = numero1 * numero2;
        System.out.println("la " + operacion3+ " de " + numero1 + " y de " + numero2 + " es igual a " + multiplicacion);

        var operacion4 = "division";
        var division = numero1 / numero2;
        System.out.println("la " + operacion4+ " de " + numero1 + " y de " + numero2 + " es igual a " + division);
    }

    private static void ejercicio7() {
        
    }
}