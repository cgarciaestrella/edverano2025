public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de la Hipotenusa");
        double a=3; double b=4;
        if (a>0 && b>0) {
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("La Hipotenusa es: " + c);
        }
        else{
            System.out.println("Los catetos deben ser mayores que cero" );
        }
        
    }
}
