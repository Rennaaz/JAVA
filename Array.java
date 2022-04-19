import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int q;
        System.out.println("Entre com a quantidade de notas: ");
        q = obj.nextInt();
        double[] notas = new double[q];
        for (int i = 0; i<q; i++){
            System.out.println("Entre com a nota: ");
            notas[i] = obj.nextDouble();
        }
        double total = 0; 
        for(int j = 0; j< notas.length; j++){
            total = total + notas[j];
        }
        total = total/q;
        System.out.println("A média será: " + total);
        
        obj.close();
    }
    
  
}

