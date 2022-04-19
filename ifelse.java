import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in); // cria objeto
        System.out.println("Insira o primeiro valor: ");
        int x = objeto.nextInt();
        System.out.println("Insira o segundo valor: ");
        int z = objeto.nextInt();

        if (x > z) {
            System.out.println("X é maior que Z");
        } else {
            System.out.println("Z é maior que X");

            objeto.close();
        }
    }

}
