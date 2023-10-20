import Dolar.Conversor;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

           System.out.println("Quanto vc vai comprar de dolar?: ");
           double Dollar = sc.nextDouble();
           System.out.println("Valor: " + Conversor.Conversao(Dollar));


     sc.close();

        }
    }
