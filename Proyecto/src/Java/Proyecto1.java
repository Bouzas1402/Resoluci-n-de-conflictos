package Java;

import java.util.Scanner;

public class Proyecto1 {
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Introduzca un numero: ");
int numero = sc.nextInt();
if ((numero % 2) == 0) {
    System.out.println("El número es par.");
} else {
    System.out.println("El número es impar.");
}

}
}
