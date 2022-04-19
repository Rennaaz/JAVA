import java.util.Scanner;

public class valores {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in); // criar objeto
        System.out.println("Insira o primeiro valor: ");
        int valorA = val.nextInt();
        System.out.println("Insira o segundo valor: ");
        int valorB = val.nextInt();
        System.out.println("Insira o terceiro valor: ");
        int valorC = val.nextInt();

        if ((valorA > valorB) && (valorA > valorC))
            System.out.println("valor A é o maior");
        if ((valorB > valorA) && (valorB > valorC))
            System.out.println("valor B é o maior");
        if ((valorC > valorA) && (valorC > valorB))
            System.out.println("valor C é o maior");

        val.close();
    }
}
