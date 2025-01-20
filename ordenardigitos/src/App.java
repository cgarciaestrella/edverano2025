public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ordenamiento de dígitos de un número mayor que 9");
        int n = 625803;
        if (n>9) {
            int m = n;
            int d = 0;
            while (m>0) {
                m = m / 10;
                d = d + 1;
            }            
            int [] a = new int[d];
            for(int i=0; i<d; i++){
                int x = n % 10;
                a[i] = x;
                n = n / 10;                
            } 
            
            // Está incompleto revisar el proyecto ordenararreglodigitos
        }
        else{
            System.out.println("XD");
        }
    }
}
