import java.util.Arrays;
import java.util.Scanner;

public class orgnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        int NM1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int NM2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número: ");
        int NM3 = scanner.nextInt();

        System.out.println("Ingresa el cuarto número: ");
        int NM4 = scanner.nextInt();

        int[] numeros = {NM1, NM2, NM3, NM4};
        Arrays.sort(numeros);

        System.out.println("Números ordenados de menor a mayor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}