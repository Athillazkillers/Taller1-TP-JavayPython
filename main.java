import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        System.out.println("Inserte Dividiendo");
        Scanner D1 = new Scanner(System.in);

        int DVD = D1.nextInt();
        System.out.println("Inserte Divisor");
        Scanner D2 = new Scanner(System.in);
        int DVSR = D2.nextInt();
        int DVSN = DVD / DVSR;
        int RSD = DVD % DVSR;
        if (DVD % DVSR == 0) {
            System.out.println("La division es EXACTA   Residuo: " + RSD + "  Cociente: " + DVSN);
        }
        else {
            System.out.println("La division es INEXACTA   Residuo: " + RSD + "  Cociente: " + DVSN);
        }

    }
}