import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Balancea los corchetes y paréntesis de una expresión de regular");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la expresión regular");
        String cadena = teclado.nextLine();
        int t = cadena.length();
        if (t>0) {
            int cima = -1;
            String [] pila = new String[t];
            String caracter;
            for (int i = 0; i < t; i++) {
                caracter = cadena.substring(i, i+1);
                if(caracter.equals("(") || caracter.equals(")") || caracter.equals("[") || caracter.equals("]")  ){
                    cima = cima + 1;
                    pila[cima] = caracter;
                }
            }
            // Aquí se debe evaluar los corchetes y paréntesis
            
            System.out.println("Los elementos de la pila son: ");
            for (int i = cima; i >= 0; i--) {
                System.out.println(pila[i]);
            }

        }
        else{
            System.out.println("No existe cadena para operar");
        }
        
    }
}
