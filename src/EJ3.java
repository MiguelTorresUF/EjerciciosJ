import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa Dias");
        int dia = teclado.nextInt();

        int mult = dia *2;

        System.out.println("Total de pago es:"+mult);


    }
}
