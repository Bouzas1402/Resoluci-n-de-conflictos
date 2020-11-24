package Java;

import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero = sc.nextInt();
        int i;
        if ((numero % 2) == 0) {
            System.out.println("El número es par.");
            System.out.println("Por lo tanto no puede ser primo");
        } else {
            System.out.println("El número es impar.");
            System.out.println("Por lo tanto podría ser primo");
        }
for (i = 0; i < numero; i++) {
    numero += i;
}
System.out.println(numero);
    }
}
