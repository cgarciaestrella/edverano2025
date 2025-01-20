public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Crear un nuevo arreglo con los digitos de 2 números");
        int n = 682363;  // 
        int m = 5653833; // 
        int x = n; int z = m;
        int d = 0; int e = 0; int h = 0;
        if (n>=0 && m>=0) {
            while (x>0) { // Cantidad de dígitos de n
                x = x / 10;
                d = d + 1;
            }
            while (z>0) { // Cantidad de dígitos de m
                z = z / 10;
                e = e + 1;
            }
            int [] a = new int[d]; // Creo el arreglo a
            int [] b = new int[e]; // Creo el arreglo b
            for(int i=0; i<d; i++){ // Ingreso los datos en A
                int y = n % 10; 
                a[i] = y;
                n = n / 10;
            }
            for(int i=0; i<e; i++){ // Ingreso los datos en B
                int y = m % 10;
                b[i] = y;
                m = m / 10;
            }
            // Determinar la cantidad de coincidiencias
            for(int i=0; i<d; i++){
                for(int j=0; j<e; j++){
                    if (a[i]==b[j]) {
                        h = h + 1; // Cantidad de elementos de C                            
                    }
                }
            }
            if (h>0) {
                int [] c = new int[h];
                int w = 0;
                for(int i=0; i<d; i++){
                    for(int j=0; j<e; j++){
                        if (a[i]==b[j]) {
                            c[w] = a[i];
                            w = w + 1;
                            if(w == h -1){
                                break;
                            }

                        }
                    }
                }
                
                // Falta el proceso de ordenar el arreglo
                
                for (int i=0; i<h; i++) {
                    System.out.println(c[i]);
                }    
            }
            else{
                System.out.println("No existen coincidencias");
            }
        }
        else{
            System.out.println("Los números deben ser positivos");
        } 
    }
}
