public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Extraer espacios en blanco de una frase");
        String cadena = "Ella no te ama :3";
        int t = cadena.length();
        int contar = 0;
        for(int i=0; i<t; i++){
            if (cadena.charAt(i) == ' ') {
                contar = contar + 1;
            }    
        }
        // String cadena = "Ella no te ama :3";
        int z = t - contar;
        String [] cad = new String[z];
        int indice = 0;
        for(int i=0; i<t;i++){
            if (cadena.charAt(i) != ' ') {
                String x = cadena.substring(i, i+1);
                cad[indice] = x;
                indice = indice + 1;
            }    
        }
        for(int i=0; i<z;i++){
            System.out.println(cad[i]);    
        }
    }
}
