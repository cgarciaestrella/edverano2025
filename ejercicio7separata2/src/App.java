public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ordena los caracteres de una palabra");
        String palabra = "amante";
        int t = palabra.length(); // Cuenta el tamaño de la palabra
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        String [] cadena = new String[t];
        for(int i=0; i<t; i++){
            String x = palabra.substring(i, i+1);
            cadena[i] = x;
        }
        // Ordenar las letras
        // String palabra = "amante";
        // palabra ordenada = "aaemnt"
        for(int i=1; i<t; i++){
            for(int j=0; j<t-i; j++){
                int x = abecedario.indexOf(cadena[j]);
                int y = abecedario.indexOf(cadena[j+1]);
                if(x > y){
                    String aux = cadena[j];
                    cadena[j] = cadena[j+1];
                    cadena[j+1] = aux;     
                }
            }
        }
        // Mostrando los elementos del arreglo
        for(int i=0; i<t; i++){
            System.out.println(cadena[i]);
        }

        
    }
    // Falta validar si el tamaño de la cadena es = 0
}
