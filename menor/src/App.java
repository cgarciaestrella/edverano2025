import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("El menor de 10 números");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int menor = teclado.nextInt();
        for(int i=2;i<=10;i++){ // Esto es para
            System.out.println("Ingrese el siguiente número:");
            int x = teclado.nextInt();
            if (x<menor) { 
                menor = x;    
            }            
        }
        System.out.println("El menor es: " + menor);       
    }
}
