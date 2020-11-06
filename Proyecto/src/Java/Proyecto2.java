package Java;


import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos numeros para sumar y multiplicar:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        System.out.println("RESULTADO:");
        System.out.println(numero1 + "+" + numero2 + "=" + (numero1 + numero2));
        System.out.println(numero1 + "-" + numero2 + "=" + (numero1 * numero2));
        System.out.println("Gracias.");
    }
}
