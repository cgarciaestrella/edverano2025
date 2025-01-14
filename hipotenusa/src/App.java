public class App {
    public static void main(String[] args) throws Exception {
        int a=3; 
        int b=4;
        if (a>0 && b>0) {
            double c = Math.sqrt((Math.pow(a, 2)) +(Math.pow(b, 2)));
            System.out.println("La hipotenusa es: "+ c);
        }
        else{
            System.out.println("Los catetos deben ser mayores que cero");
        }
    }
}
