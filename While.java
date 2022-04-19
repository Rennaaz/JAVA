import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in); // criar objeto
        System.out.println("Insira um valor inicial: ");
        int ini = valor.nextInt();
        System.out.println("Insira um valor final: ");
        int fnl = valor.nextInt();
        if (ini < fnl) {
            while (ini < fnl) {
                System.out.println(ini);
                ini++;
            }

        } else {
            while (ini > fnl) {
                System.out.println(ini);
                ini--;
            }
        }

        valor.close();
    }

}
