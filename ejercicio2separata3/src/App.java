import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ordenamiento de un matriz");
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
            // Ordanmiento de una matriz
            int limite = n * m - 1; // 11 si n=4 y m=3
            int aux;
            for(int k=limite; k>=1; k--){ // Controla la cantidad de comparaciones
                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        if(j==m-1){
                            if (i < n - 1 && a[i][j]>a[i+1][0]) {
                                aux = a[i][j];
                                a[i][j] = a[i+1][0];
                                a[i+1][0] = aux;
                            }                              
                        }
                        else{
                            if (a[i][j]>a[i][j+1]) {
                                aux = a[i][j];
                                a[i][j] = a[i][j+1];
                                a[i][j+1] = aux;
                            }    
                        }
                    }    
                }
            }
            // Mostrando sus elementos
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
