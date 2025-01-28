import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ordenamiento por selección");
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
            // Método de ordenamiento por selección
            int x=0, y=0, i, j, aux;
            int limite = n * m - 1; 
            for(int k=limite;k>=1; k--){
                for (i=x; i<n; i++) {
                    for (j=y; j<m; j++) {
                        if (i<n-1 && a[x][y]>a[i+1][0]) {
                            aux = a[x][y];
                            a[x][y] = a[i+1][0];
                            a[i+1][0] = aux;
                        }
                        else{
                            if (j<m-1 && a[x][y]>a[i][j+1]) {
                                aux = a[x][y];
                                a[x][y] = a[i][j+1];
                                a[i][j+1] = aux;
                            }    
                        }    
                    }
                    y=y+1;  
                }
                x=x+1;                   
            }
            
            // Mostrar los elementos de la matriz
            System.out.println("Mostrando los elementos de la matriz");
            for(i=0; i<n; i++){
                for(j=0; j<m; j++){
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
