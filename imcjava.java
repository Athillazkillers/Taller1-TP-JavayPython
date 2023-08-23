import java.util.Scanner;
public class imcjava {
    public static void main(String[] args){
        System.out.println("Introduzca su edad");
        Scanner E = new Scanner(System.in);
        int ED = E.nextInt();
        System.out.println("Introduzca su Estatura");
        Scanner Es = new Scanner(System.in);
        double ES = Es.nextInt();
        System.out.println("Introduzca su Peso");
        Scanner P = new Scanner(System.in);
        double PS = P.nextInt();
        double IMC = PS /(ES*ES);
        if(ED<45&&IMC<22.0){
            System.out.println("Su IMC es de: "+IMC+"Y es BAJO");
        } else if (ED<45&&IMC>=22.0) {
            System.out.println("Su IMC es de: "+IMC+"Y es MEDIO");
        } else if (ED>=45&&IMC<22.0) {
            System.out.println("Su IMC es de: "+IMC+"Y es MEDIO");
        } else if (ED>=45&&IMC>=22.0) {
            System.out.println("Su IMC es de: "+IMC+"Y es ALTO");
        }
        {

        }


    }
}