import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Búsqueda secuencial - Método de burbuja");
        int m = 0; // número de términos del arreglo
        if (m>0) {
            Scanner teclado = new Scanner(System.in);
            int [] a = new int[m];
            for(int i=0; i<m; i++) {
                System.out.println("Ingrese el elemento " +(i+1)+" :");
                int x = teclado.nextInt();
                a[i] = x; 
            }
            System.out.println("Ingrese el elemento a buscar:");
            int x = teclado.nextInt();
            int flag = 0;
            for(int i=0; i<m; i++) { // Búsqueda secuencial
                if (x == a[i]) {
                    System.out.println("Encontrado"); 
                    flag = 1; break;    
                }
            }
            if (flag==0) {
                System.out.println("No encontrado");     
            }   
        }
        else{
            System.out.println("Debe ser mayor que cero elementos");
        }
    }
}
