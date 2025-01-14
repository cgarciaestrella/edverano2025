public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Factorial de un número");
        int n = 10;
        if (n>=0) {
            if (n==0) {
                System.out.println("Factorial : 1");
            }
            else{
                int f = 1;
                for(int i=1; i<=n; i++){
                    f = f * i;
                }
                System.out.println("Factorial :" + f);
            }
        }
        else{
            System.out.println("El número debe ser mayor o igual que cero");
        } 
    }
}
