import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mi primera pila");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de la pila");
        int elementos = teclado.nextInt();
        if(elementos>0){
            int[] pila = new int[elementos];
            int cima=-1;
            int opcion;    
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Insertar un elemento (push)");
                System.out.println("2. Quitar un elemento (pop)");
                System.out.println("3. Mostrar elementos de la pila");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = teclado.nextInt();
    
                switch (opcion) {
                    case 1:
                        if (cima < elementos - 1) {
                            System.out.print("Ingrese el elemento a insertar: ");
                            int elemento = teclado.nextInt();
                            cima = cima + 1;
                            pila[cima] = elemento; 
                            System.out.println("Elemento insertado.");
                        } 
                        else {
                            System.out.println("La pila está llena.");
                        }
                        break;
                    case 2:
                        if (cima >= 0) {
                            System.out.println("Elemento eliminado: " + pila[cima]);
                            cima = cima - 1;
                        } 
                        else {
                            System.out.println("La pila está vacía.");
                        }
                        break;
                    case 3:
                        if (cima >= 0) {
                            System.out.println("Elementos en la pila:");
                            for (int i = cima; i >= 0; i--) {
                                System.out.println(pila[i]);
                            }
                        } 
                        else {
                            System.out.println("La pila está vacía.");
                        }
                        break;
                    case 4:
                        System.out.println("Adiós bebé");
                        break;
                    default:
                        System.out.println("No existe esta opción, intente nuevamente");
                }
            } while (opcion != 4);
        }
        else{
            System.out.println("La cantidad de elementos debe ser mayor que cero");
        }
    }
}
