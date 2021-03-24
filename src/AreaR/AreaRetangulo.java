

package AreaR;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author wagner
 */
public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continua = true;
        do {
            try {
                System.out.print("Digite o valor da base: ");
                int v1 = entrada.nextInt();
                System.out.print("Digite o valor da altura: ");
                int v2 = entrada.nextInt();
                int area = v1 * v2;
                System.out.println("O valor da area do retangulo e : " + area + " m²");
                continua = false;
            } catch (InputMismatchException e) {
                System.out.println("Erro-digite um inteiro: ");
                entrada.nextLine();
            }
        } while (continua);
    }
}


