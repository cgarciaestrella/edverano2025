import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tres en raya XD");
        String [][] a = new String[3][3]; // Creo la matriz
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a jugar tres en raya");    
        // Ingresando valores "" en la matriz
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = ""; 
            }    
        }
        int turno = 1, movimiento = 0, fila, columna;
        String x="x", o = "0";
        while (movimiento<=9) {
            if (turno==1) {
                System.out.println("Es el turno de X, ingrese la posición (fila,columna)");
                System.out.println("Ingrese la fila (entre 0 y 2)");
                fila = teclado.nextInt();
                while (fila<0 || fila>2) {
                    System.out.println("Ingrese la fila correcta para X (entre 0 y 2):");
                    fila = teclado.nextInt();
                }
                System.out.println("Ingrese la columna (entre 0 y 2)");
                columna = teclado.nextInt();
                while (columna<0 || columna>2) {
                    System.out.println("Ingrese la columna correcta para X (entre 0 y 2):");
                    columna = teclado.nextInt();
                }
                if(a[fila][columna] == ""){
                    a[fila][columna] = x;
                    turno = 2; 
                }
                else{
                    System.out.println("Posición ocupada, ya pes mano");
                }
            }
            else{
                System.out.println("Es el turno de 0, ingrese la posición (fila,columna):");
                System.out.println("Ingrese la fila (entre 0 y 2)");
                fila = teclado.nextInt();
                while (fila<0 || fila>2) {
                    System.out.println("Ingrese la fila correcta para 0 (entre 0 y 2):");
                    fila = teclado.nextInt();
                }
                System.out.println("Ingrese la columna (entre 0 y 2)");
                columna = teclado.nextInt();
                while (columna<0 || columna>2) {
                    System.out.println("Ingrese la columna correcta para 0 (entre 0 y 2):");
                    columna = teclado.nextInt();
                }
                if(a[fila][columna] == ""){
                    a[fila][columna] = o;
                    turno = 1; 
                }
                else{
                    System.out.println("Posición ocupada, ya pes mano");
                }
            }
            movimiento = movimiento + 1;
            if (movimiento==5) {
                System.out.println("Ya puedes ganar");
                // Tengo evaluar al posible ganador
            }       
        }  
        
        // Mostrando sus elementos
        System.out.println("Mostrando los elementos de la matriz");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Elemento de ("+ (i) +"," + (j) + "): "+ a[i][j]);                     
            }    
        }               
    }
}
