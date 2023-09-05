import java.util.Scanner;
public class Rango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos: ");

        int cantidadDatos = sc.nextInt();
        if (cantidadDatos <= 0) {
            System.out.println("La cantidad de datos debe ser mayor que cero.");
            return;
        }

        double[] datos = new double[cantidadDatos];//Se crea un pequeño arreglo para la cantidad de valores va ingresar el usuario
        //Este for hace que se muestre el orden de los datos que va ingresando el usario
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.print("Ingrese el dato #" + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }

        double maximo = datos[0];// Actualiza el valor minimo y maximo segun el usuario va ingresando los datos
        double minimo = datos[0];
// Este for hace que se vallan evaluando el valor minimo y maximo para despues restarlos
        for (int i = 1; i < cantidadDatos; i++) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
            if (datos[i] < minimo) {
                minimo = datos[i];
            }
        }

        double rango = maximo - minimo;

        System.out.println("El rango de los datos es: " + rango);

    }
}
