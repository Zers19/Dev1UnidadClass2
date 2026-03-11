import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        int num1= 0, num2= 0, num3= 0, num4= 0;
        Scanner entrada = new Scanner(System.in);
    
    //Aquí estableceremos el programa para pedir al usuario los datos  
       System.out.println("Introduce el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Introduce el tercer número: ");
        num3 = entrada.nextInt();
        System.out.println("Introduce el cuarto número: ");
        num4 = entrada.nextInt();

        //Estableceremos la formula que vamos a programar para conseguir el resultado
        int resultado = num1 / num2 * (num3 + num4);
        System.out.println("El resultado es: " + resultado);
}
}