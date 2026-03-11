import java.util.Scanner;

public class ejercicioad4 {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
    
       //Similar al anterior programa, debemos es restar los gastos del dinero restante para determinar el dinero que se tiene al final de la salida a Cine de Carmen.
   double dineroInicial, dineroFinal; //Usamos camel case, observación del profesor. 

   //Pedimos los datos para la operación.
   System.out.println("Ingrese el dinero inicial: ");
   dineroInicial = entrada.nextDouble();
    System.out.println("Ingrese el dinero final: ");
    dineroFinal = entrada.nextDouble();
entrada.close();
    //Hacemos la operación para saber cuanto se gasto Carmen en total. 
    double dineroGastado = dineroInicial - dineroFinal;
    System.out.printf("El dinero gastado fue: %.2f euros", dineroGastado);

    }
}
