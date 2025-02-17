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
            int cc = 0; int cp = 0; String elemento;
            for (int i = cima; i >= 0; i--) {
                elemento = pila[i];
                switch (elemento) {
                    case "[":
                        cc = cc + 1; break;
                    case "]":
                        cc = cc - 1; break;
                    case "(":
                        cp = cp + 1; break;
                    case ")":
                        cp = cp - 1; 
                        break;
                }
            }
            if (cima == -1) {
                System.out.println("La pila está vacía");
            }
            else{
                System.out.println("Los elementos de la pila son: ");
                for (int i = cima; i >= 0; i--) {
                    System.out.println(pila[i]);
                }
                if(cc == 0 && cp == 0 ){
                    System.out.println("La expresión está balanceada");           
                }
                else{
                    System.out.println("La expresión no está balanceada");
                }
            }
        }
        else{
            System.out.println("No existe cadena para operar");
        }
        
    }
}
