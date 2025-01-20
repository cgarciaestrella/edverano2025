public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ordenar descendentemente los digitos de un arreglo mayor de 2 çifras");
        int n = 891036;
        int m = n;
        int d = 0;
        if (n>9) {
            // Contar la cantidad de dígitos
            while (m>0) {
                m = m / 10;
                d = d + 1;
            }
            int [] a = new int[d]; // Crear el arreglo
            
            //Ingresar los dígitos en el arreglo
            for(int i=0; i<d; i++){
                int y = n % 10;
                a[i] = y;
                n = n / 10;
            }
            // Ordenar descendentemente los datos de un arreglo
            for(int i=1; i<d; i++){
                for(int j=0; j<d-i; j++){
                    if (a[j]<a[j+1]) {
                        int aux = a[j];
                        a[j] = a[j+1];
                        a[j+1] = aux;
                    }
                }    
            }
            for(int i=0; i<d; i++ ){
                System.out.println(a[i]);
            }   
        }
        else{
            System.out.println("Debe ser de 2 dígitos");
        }
    }
}
