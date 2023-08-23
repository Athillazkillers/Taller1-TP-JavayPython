import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class fechanac {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("ingrese su fecha de nacimiento en formato (AAAA-MM-DD): ");
        String FNS = S.nextLine();
        LocalDate FN = LocalDate.parse(FNS);

        LocalDate FA = LocalDate.now();
        Period P = Period.between(FN, FA);
        int E = P.getYears();

        System.out.println("Su edad es: " + E);
    }
}