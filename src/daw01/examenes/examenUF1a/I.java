package daw01.examenes.examenUF1a;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas en vertical (minimo 5, contando primera y ultima): ");
        int vert = sc.nextInt();
        System.out.print("Carácter a utilizar en el dubujo para representa la letra I: ");
        String carct = sc.next();

        int cont = 0;
        while (vert < 5) {
            System.out.print("Valor demasiado bajo, el valor minimo es 5");
            vert = sc.nextInt();
            System.out.print("Carácter a utilizar en el dubujo para representa la letra I:");
            carct = sc.next();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(carct);
        }
        System.out.println();

        for (int i = 0; i < vert - 2; i++) {
            System.out.println(" " + carct);
            cont++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(carct);
        }
        System.out.println();
    }
}
