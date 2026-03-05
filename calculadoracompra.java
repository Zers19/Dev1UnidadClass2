
import java.util.Scanner;

public class calculadoracompra {
    public static void main(String[] args) {
        
    final double impuesto = 0.15; // Tasa de impuesto que aplicamos

    Scanner entrada = new Scanner(System.in);

    System.out.println(" Bienvenido al portal de compras ");
    System.out.println(" ingrese el valor a pagar: ");
    double valorproducto = entrada.nextDouble();
    System.out.print("Ingrese la cantidad: ");
    int cantidad = entrada.nextInt();
    System.out.println("Valor pagado por cliente: ");
    double valorpagado = entrada.nextDouble();
    entrada.nextLine(); // limpiamos el buffer

    //Ahora procedemos a calcular y darle una factura visual al cliente
    var subtotal = valorproducto * cantidad;
    var iva = subtotal * impuesto;
    var total = subtotal + iva;
    var cambio = valorpagado - total;

    System.out.println("---Factura de compra---");
    System.out.println("Valor del producto: " + valorproducto);
    System.out.println("Cantidad: " + cantidad);
    System.out.println("Subtotal: " + subtotal);
    System.out.println("IVA (15%): " + iva);
    System.out.println("Total a pagar: " + total);
    System.out.println("Valor pagado: " + valorpagado);
    System.out.println("Cambio: " + cambio);

    entrada.close();

    System.out.println("Recuerde no botar su factura, es su comprobante de compra y garantía del producto. Gracias por su compra!");

    
}
}
