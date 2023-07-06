package com.betrybe.frete;

import com.betrybe.frete.calculadora.CalculadoraFrete;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    CalculadoraFrete calc = new CalculadoraFrete();

    Scanner scanner = new Scanner(System.in);
    String option = menu(scanner);
    while (!option.equals("S")) {
      double frete = 0;

      System.out.println("Digite o preço do produto:");
      double preco = Double.parseDouble(scanner.nextLine());

      if (option.equals("D")) {
        System.out.println("Digite a distância: ");
        int distancia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o peso (kg): ");
        double peso = Double.parseDouble(scanner.nextLine());

        frete = calc.fretePorDistanciaPeso(distancia, peso);
      } else if (option.equals("F")) {
        frete = calc.fretePorFaixaDePreco(preco);
      }

      relatorio(preco, frete);

      option = menu(scanner);
    }

    System.out.println("Iniciando sistema...");
  }

  private static String menu(Scanner scanner) {
    System.out.println("Selecione uma opção");
    System.out.println("D - Calcular preço total (por distância e peso)");
    System.out.println("F - Calcular preço total (por faixa de preço)");
    System.out.println("S - Sair ");
    return scanner.nextLine().toUpperCase();
  }

  private static void relatorio(double preco, double frete){
    System.out.println("Preço do produto " + preco);
    System.out.println("Frete: R$ " + frete);
    System.out.println("Preço Total: R$ " + (frete + preco));
  }

}
