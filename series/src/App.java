public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Series numéricas");
        int n = 3;
        if (n>0) {
            double s = 0; double t = 2; double h;
            for(int i=1; i<=n; i++){
                if (i % 2 == 0) {
                    h = 1 / t;
                }
                else{
                    t = t * 2; h = t;
                }
                s = s + h;
            }
            System.out.println("La suma es: " + s);
        }   
        else{
            System.out.println("Ya pes mano!");
        }
    }
}
