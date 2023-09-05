import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingrese valores enteros (0 para terminar):");

        int valor = 1;  // Inicializamos valor con cualquier número diferente de 0 para entrar en el bucle

        while (valor != 0) {
            valor = Sc.nextInt();

            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            }
        }

        System.out.println("Gráfico de valores positivos y negativos:");
        System.out.print("Positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("Negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
    }
}