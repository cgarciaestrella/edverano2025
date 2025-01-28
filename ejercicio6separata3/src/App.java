import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Encontrar elemento en una matriz");
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
            // Mostrar en la posición encontrada
            System.out.println("Ingrese el número a buscar");
            int z = teclado.nextInt();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j]==z) {
                        System.out.println("Encontrado en el posición "+i+","+j);
                        flag=1;
                    }    
                }                
            }
            if (flag==0) {
                System.out.println("No se encontró el elemento");
            }
            
            // Mostrando sus elementos
            /*System.out.println("Mostrando los elementos de la matriz");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.println("Elemento de ("+ (i) +"," + (j) + "): "+ a[i][j]);                     
                }    
            }*/               
        }
        else{
            System.out.println("Los valores deben ser mayor que cero");
        }
    }
}
