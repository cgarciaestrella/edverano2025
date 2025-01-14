public class App {
    public static void main(String[] args) throws Exception {
        double calificacion = 20;
        if(calificacion>=0 && calificacion<=20) {
            if(calificacion<=10.5){
                System.out.println("Malo");
            }
            else{
                if(calificacion>10.5 && calificacion<=14){
                    System.out.println("Regular");
                }
                else{
                    if (calificacion>14 && calificacion<=18) {
                        System.out.println("Bueno");
                    }
                    else{
                        System.out.println("Excelente");
                    }
                }
            }
        }
        else{
            System.out.println("La calificación debe estar entre 0 y 20");
        }
    }
}
