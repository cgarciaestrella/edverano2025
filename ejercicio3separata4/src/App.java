import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Convierte un número en base decimal a base binaria");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número en base decimal");
        int numero = teclado.nextInt();
        if(numero>=0){
            int aux = numero;
            int d = 0;
            while (aux>0) {
                aux = aux / 2;
                d = d + 1;
            }
            int cima = -1; 
            int [] pila = new int[d];
            aux = numero;
            while (aux>0) {
                cima = cima + 1;
                pila[cima] = aux % 2;
                aux = aux / 2;
            }
            System.out.println("Elementos en la pila:");
            for (int i = cima; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }
        else{
            System.out.println("El número debe ser mayor que cero");
        }
    }
}
