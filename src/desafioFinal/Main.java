package desafioFinal;

import java.util.Scanner;

class Calculadora {


    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }


    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }


    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }


    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; // Retorna "Not a Number" se houver divisão por zero
        }
    }
}


public class Main {
    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        // Menu de operações
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("Resultado da adição: " + calculadora.adicionar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }


        scanner.close();
    }
}

