package Program;


import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção (1-SOMA 2-SUBTRAIR 3-MULTIPLICAR 4-DIVIDIR 5-SAIR)");
        int opcao = sc.nextInt();

        while(opcao != 5) {
            System.out.println("Digite um numero");
            double numero1 = sc.nextDouble();

            System.out.println("Digite o segundo numero");
            double numero2 = sc.nextDouble();

            Calculator calculator = new Calculator(numero1, numero2);
            if(opcao == 1) {
                System.out.println(calculator.soma());
            }

            if(opcao == 2) {
                System.out.println(calculator.subtracao());
            }

            if (opcao == 3) {
                System.out.println(calculator.multiplicacao());
            }
            if(opcao == 4) {
                System.out.println(calculator.divisao());
            }
        }

        sc.close();
    }

}
