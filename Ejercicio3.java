/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        /**
         * Instanciamos objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);
        
        /**
         * Declaramos dos variables para almacenar el numero ingresado por el usuario 
         * Y otra para almacenar el dato del factorial de ese numero
         */
        int numeroIngresado, factorial=1;

        /**
         * Almacenamos el numero por desde consola
         */
        System.out.println("Ingresa un numero");
        numeroIngresado = scanner.nextInt();

        /**
         * Ciclo para poder multiplicar hasta el numero ingresado por el usuario
         */
        for(int i=1; i<=numeroIngresado; i++){
            factorial *= i;
        }

        /**
         * Imprimimos el resultado en consola
         */
        System.out.println("El factorial de "+numeroIngresado+" es: "+factorial);
    }
}
