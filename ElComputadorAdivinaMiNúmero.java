import java.util.Scanner;

public class ElComputadorAdivinaMiNúmero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Piensa en un número entre 1 y 100.");
        System.out.println("Cuando estés listo, ingresa < si es menor, > si es mayor o = si es correcto.");
        System.out.println("Presione enter para empezar");
        sc.nextLine();
        int minimo = 1;
        int maximo = 100;
        boolean adivinado = false;

        while (!adivinado) {
            int intento = (minimo + maximo) / 2;
            System.out.println("¿Es " + intento + "? Ingresa <, > o =: ");
            String respuesta = sc.nextLine();

            if (respuesta.equals("<")) {
                maximo = intento - 1;
            } else if (respuesta.equals(">")) {
                minimo = intento + 1;
            } else if (respuesta.equals("=")) {
                System.out.println("Es el numero: " + intento + " ¡Soy muy aspero xd!");
                adivinado = true;
            } else {
                System.out.println("Por favor, ingresa <, > o =.");
            }
        }
    }
}
