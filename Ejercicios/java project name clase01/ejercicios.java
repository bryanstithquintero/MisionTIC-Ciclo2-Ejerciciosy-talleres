import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejercicios {
    private static int numero;

    public static void main(String[] args) {
        ejercicio12();
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
        var numerodigitos = 0;
        System.out.print("ingrese un numero: ");
        var numero = sc.nextLong();
        sc.close();
        
        do {
            numero /= 10;
            numerodigitos++;
        } while (numero > 0);
        
        System.out.printf("el numero ingresado tiene %d digitos", numerodigitos);
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
        var sc = new Scanner(System.in);
        System.out.print("ingrese la primera nota: ");
        var nota1 = sc.nextFloat();
        System.out.print("ingrese la segunda nota: ");
        var nota2 = sc.nextFloat();
        System.out.print("ingrese la tercera nota: ");
        var nota3 = sc.nextFloat();
        sc.close();

        var promedio = (nota1 + nota2 + nota3) / 3;
        var resultado = (promedio >= 3.0)? "aprobado":"reprobado";
        System.out.printf("el promedio del estudiante es %.2f por lo que el estudiante a %s", promedio, resultado);
    }

    private static void ejercicio8() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese las horas trabajadas: ");
        var horas = sc.nextInt();
        sc.close();

        DecimalFormat formatea = new DecimalFormat("###,###,###");
        var valorhora = 30000;
        var sueldo = horas * valorhora;

        System.out.printf("el sueldo del trabajador es %s", formatea.format(sueldo));
    }

    private static void ejercicio9() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese su numero: ");
        var numero = sc.nextInt();
        sc.close();

        System.out.println("la tabla del " + numero);
        for (int i = 0; i <= 10; i++) {
            var tabla = numero + " * " + i + " = " + numero*i;
            System.out.println(tabla);
        }
    }

    private static void ejercicio10() {
        var adivinar = ThreadLocalRandom.current().nextInt(1, 100);
        try (var sc = new Scanner(System.in)) {
            do {
                System.out.print("ingrese su numero: ");
                int numero = sc.nextInt();
                System.out.print("ingrese su numero: ");

                if (adivinar > numero) {
                    System.out.println("el numero que busca es mayor");
                } else if (adivinar < numero) {
                    System.out.println("el numero que busca es menor");
                } else if (adivinar == numero) {
                    System.out.println("Has acertado, el número que pensé fue: " + adivinar);
                    break;
                }
                } while (adivinar != numero);
        }
        }

    private static void ejercicio11() {
        var sc = new Scanner(System.in);
        System.out.print("ingrese su sexo (H/M): ");
        var sexo = sc.nextLine();
        System.out.print("ingrese su altura: ");
        var altura = sc.nextInt();
        sc.close();

        switch (sexo) {
            case "H":
                var pesoh = altura-110;
                System.out.printf("el peso ideal es %s kilos", pesoh);
                break;
            case "M":
                var pesom = altura- 100;
                System.out.printf("el peso ideal es %s kilos", pesom);
                break;
            default:
                break;
        }
    }

    private static void ejercicio12() {
        var sc = new Scanner(System.in);
        var primo = true;
        String respuesta;
        do {
            System.out.print("ingrese su numero: ");
            int num = sc.nextInt();
            for (int ind = 2; ind < num; ind++) {
                if (num % ind == 0) {
                    primo = false;
                }
            }
            if (primo == true) {
                System.out.println(num  + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
            System.out.println("quieres continuar? S/N");
            respuesta = sc.next();
        } while (respuesta.equals("S"));
        sc.close();
    }

    private static void ejercicio13() {
        
    }
}