import java.util.Random;
import java.util.Scanner;

public class YoAdivinoUnNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int intento;
        int intentoRealizados = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivine el numero");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = sc.nextInt();
            intentoRealizados++;

            if (intento < randomNumber) {
                System.out.println("El número pensado es mayor.");
            } else if (intento > randomNumber) {
                System.out.println("El número pensado es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número " + randomNumber +
                        " en " + intentoRealizados + " intentos.");
            }
        } while (intento != randomNumber);
    }
}
