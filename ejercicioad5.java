import java.util.Scanner;

public class ejercicioad5 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
    
       //Replicamos frente alos anteriores dos programas, para poder conocer cuanto toca pagar al final de la compra.
   double precioTotal, descuento; //Usamos camel case, observación del profesor. 
   boolean descuentoProntoPago; //Usamos un booleano para determinar si se aplica el descuento o no.

   //Pedimos los datos para la operación.
   System.out.println("Ingrese el precio total: ");
   precioTotal = entrada.nextDouble();
   System.out.println("¿Aplica descuento pronto pago?: ");
   descuentoProntoPago = entrada.nextBoolean();

    entrada.close();
    
    //Usarmeos un condicional para determinar si le aplica descuento
    if (descuentoProntoPago) {
        descuentoProntoPago = true; //Quedo con la duda de como poder implementar el booleano con Si o no. Pendiente a su retroalimentación. 
        descuento = precioTotal * 0.10; //Calculamos el descuento
        double precioFinal = precioTotal - descuento; //Calculamos el dinero final a pagar
        System.out.printf("Precio total es: %.2f euros\n", precioTotal);
        System.out.printf("El descuento aplicado es: %.2f euros\n", descuento);
        System.out.printf("Valor final a pagar es: %.2f euros\n", precioFinal);
    } else {
        descuentoProntoPago = false;
        double precioFinal = precioTotal;
        System.out.printf("Precio total es: %.2f euros\n", precioTotal);
        System.out.printf("No se aplicó descuento por pronto pago.\n");
    }
}
}
