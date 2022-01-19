import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa impuesto correspondiente");
        int impuesto = teclado.nextInt();
        if (impuesto == 1) {
            int valor = (int)(23563899 * 0.02450);

            System.out.println("PREMIO ES: $" + (23563899- valor));


        } else if (impuesto == 2) {
            int valor2 = (int) (23563899 *0.15);
            System.out.println("PREMIO ES: $" + ((23563899 - valor2)*10));
        } else if (impuesto == 3) {
            int valor3 =(int) (23563899 * 0.03);
            System.out.println("PREMIO ES: $" + (23563899 - valor3));
        } else {
            System.out.println("ERROR INGRESA UN VALOR VALIDO");
        }

    }
}