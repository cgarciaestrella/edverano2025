import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mi primera pila");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de la pila");
        int elementos = teclado.nextInt();
        if(elementos>0){
            int[] pila = new int[elementos];
            int cima = -1;
            int veces = 0;
            while (veces < 10) {
                veces = veces + 1;
                if(cima == elementos-1){
                    System.out.println("La pila está llena");
                }
                else{
                    cima = cima + 1;
                    System.out.println("Inserte un elemento en la pila");
                    int apilar = teclado.nextInt();
                    pila[cima] = apilar;
                }
            }
            System.out.println("Mostrando los elementos de la pila");
            for(int i=cima; i>=0; i--){
                System.out.println("La cima actual es: " + pila[i]);
                System.out.println("Pop de " + pila[i] +" de la posicion "+ i );
                System.out.println("--------");
            }
            System.out.println("La pila está vacía");

        }
        else{
            System.out.println("La cantidad de elementos debe ser mayor que cero");
        }
        


    }
}