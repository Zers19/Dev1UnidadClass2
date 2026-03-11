
import java.util.Scanner;

public class ejercicioad2 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double pernilIbericx100g = 5.95; // Precio por 100 gramos de pernil ibéric D Engreix Llen. Azuaga
        double precio = pernilIbericx100g * 10; // Precio por kilogramo de pernil ibéric D Engreix Llen. Azuaga

        //Haremos un programa que nos verifique si el precio es correcto o no por medio de entrada de datos. 
        System.out.println("Introduce el precio del producto: "); //Aquí podemos ingresar el valor dado por el vendedor. 
        precio = entrada.nextDouble();
        entrada.nextLine(); // Limpiamos el buffer
        System.out.println("Introduce el nombre del producto: ");
        String nombre = entrada.nextLine();
        entrada.close();
        

        //Ahora agregamos un condicional para verificar si el precio es correcto o no.
        if (nombre.equalsIgnoreCase("pernil iberic")) { // Verificamos si el producto es el pernil ibérico
            if (precio == pernilIbericx100g * 10) { // Convertimos el precio por 100 gramos a precio por kilogramo
                System.out.println("El precio es correcto.");
            } else {
                System.out.printf("El precio es incorrecto. El precio correcto para %s es: %.2f euros por Kg.", nombre, pernilIbericx100g * 10);
            }

    }
}
}
