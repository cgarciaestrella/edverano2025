public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dígitos en un arreglo");
        int n = 738034;
        int z = n; // Guarda el valor de n
        int d = 0;
        int w = n;
        if (n>0) {
            while (z>0) {
                z = z / 10; // Extrae dígito por dígito
                d = d + 1; // Contar la cantidad de dígitos
            }
            /* Para operar con arreglos se debe conocer la cantidad
               de sus elementos */
            
            int[] a = new int[d]; // Así se crea un arreglo
            int[] b = new int[d];
            //Tipo de dato, nombre del arreglo, clásula new y tipo de dato más la cantidad de elementos

            for(int i=0; i<d; i++){ // Valores al revés
                int y = n % 10;
                a[i] = y; // Así se ingresa un dato en un arreglo
                n = n / 10;
            }
            for(int i=d-1; i>=0; i--){ // Valores en orden
                int m = w % 10;
                b[i] = m; // Así se ingresa un dato en un arreglo
                w = w / 10;                
            }
            for(int i=0; i<d; i++){ // Imprime al revés
                System.out.println(a[i]);
            }
            for(int i=0; i<d; i++){ // Imprime en orden
                System.out.println(b[i]);
            }
        }
        else{
            System.out.println("El número debe ser entero positivo");
        }  
    }
}
