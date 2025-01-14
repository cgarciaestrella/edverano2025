public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Condición de un estudiante universitario");
        double nota = 10.5;
        if (nota>=0 && nota<=20 ) {
            if (nota<=10.5) {
                System.out.println("Condición: Malo");    
            }
            else{
                if (nota>10.5 && nota<=14) {
                    System.out.println("Condición: Regular");    
                }
                else{
                    if (nota>14 && nota<=18) {
                        System.out.println("Condición: Regular");   
                    }
                    else{
                        System.out.println("Condición: Excelente");
                    }
                }
            }
        }
        else{
            System.out.println("Animal!");    
        }
    }
}
