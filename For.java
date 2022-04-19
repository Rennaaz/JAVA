import java.util.Scanner;

public class For {
    public static void main(String[] args) {
            Scanner inicial = new Scanner(System.in); // criar objeto
            System.out.println("Coloque um número: ");
            int num = inicial.nextInt();
        for (int i = num; i< (num+200); i= i + 2) {
            System.out.println(i);
        }
    inicial.close();
    }
}
