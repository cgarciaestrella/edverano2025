public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Raíces de una ecuación de segundo grado");
        int a=0; int b=0; int c=0;
        if (a!=0) {
            double d = Math.pow(b, 2)-4*a*c;
            if (d>0) {
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
            else{
                if (d==0) {
                    double x = (-b)/(2*a);
                    System.out.println("X = " + x);    
                }
                else{
                    System.out.println("No se puede resolver");
                }
            }
        }
        else{
            System.out.println("No es una ecuación de 2do grado");
        }
    }
}
