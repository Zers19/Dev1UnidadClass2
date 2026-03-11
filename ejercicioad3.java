import java.util.Scanner;

public class ejercicioad3 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;
    
        //solicitaremos los datos para la operación. 

        System.out.println("Ingrese número de peces rojos: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese número de peces azules: ");
        num2 = entrada.nextInt();
entrada.close();
        //Establecemos la operacion para determinar el total de peces.

        resultado = num1 + num2;
        System.out.println("El número total de peces en el acuario es de: " + resultado);
}
}
