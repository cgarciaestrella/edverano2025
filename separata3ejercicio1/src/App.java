import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresar los elementos en un matriz de n x m");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int n = teclado.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int m = teclado.nextInt();
        System.out.println("Tu matriz es de " + n + " x "+ m);
        if (n>0 && m>0) { // Valida que la matriz sea adecuada
            int [][] a = new int[n][m]; // Creo la matriz
             
            System.out.println("Ingrese los datos de la matriz");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.println("Elemento de ("+ (i) +"," + (j) + "):");
                    a[i][j] = teclado.nextInt(); 
                }    
            }
            System.out.println("Mostrando los elementos de la matriz");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.println("Elemento de ("+ (i) +"," + (j) + "): "+ a[i][j]);                     
                }    
            }
            // Mostrando el elmemento (1,3)
            // System.out.println("Elemento de (1,3): " + a[1][3]);      
        }
        else{
            System.out.println("Los valores deben ser mayor que cero");
        }
    }
}
