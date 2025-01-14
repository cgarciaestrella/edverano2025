public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Año bisiesto");
        int a = 2000;
        if (a>0) {
            int x = a % 4;
            int y = a % 100;
            int z = a % 400;
            if (x==0 || y!=0 && z==0) {
                System.out.println("Año bisiesto");
            }
            else{
                System.out.println("No es bisiesto");
            }    
        }
        else{
            System.out.println("El año debe ser mayor que cero");
        }
        
    }
}
