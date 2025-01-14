public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio del número capicúa");
        int x = 3457; // Leer x
        if (x<10) { // Verdadero (Sí)
            System.out.println("El número debe ser de 2 dígitos");
        }
        else{ // Falso (No)
            int y = x; // y = x
            int m = 0; // m = 0
            while (y!=0) { // Hacer - mientras y diferente de cero
                int z = y % 10;
                y = y / 10;
                m = m*10 + z;
                // Todo esto se ejecuta si la condición es verdadera
            }
            if (m==x) { // Si m = x (Verdadera - Sí)
                System.out.println(x + " es capicúa");
            }
            else { // (Falsa - Sí)
                System.out.println(x + " no es capicúa");
            }
        }

    }
}
