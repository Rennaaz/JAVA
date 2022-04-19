import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // criar objeto
        System.out.println("Entre com dia da semana: ");
        int dia = obj.nextInt();
        if ((dia >= 1) && (dia <= 7)) {
            if (dia == 1) {
                System.out.println("Domingo");
            }
            if (dia == 2) {
                System.out.println("Segunda");
            }
            if (dia == 3) {
                System.out.println("Terça");
            }
            if (dia == 4) {
                System.out.println("Quarta");
            }
            if (dia == 5) {
                System.out.println("Quinta");
            }
            if (dia == 6) {
                System.out.println("Sexta");
            }
            if (dia == 7) {
                System.out.println("Sabado");
            }
            obj.close();
        }

    }

}