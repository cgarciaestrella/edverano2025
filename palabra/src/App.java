public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Letras en un arreglo");
        String palabra = "Uwu, Oño, XD, :3";
        int t = palabra.length();
        String [] a = new String[t]; // Crear el arreglo
        
        // Ingresa los datos en el arreglo
        for(int i=0;i<=t-1;i++){
            String cad = palabra.substring(i, i+1);
            a[i] = cad;
        }
        // Mostrar el arreglo
        for(int i=0;i<=t-1;i++){
            System.out.print(a[i]);
        }
    }
}
