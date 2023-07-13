package com.main;

import com.ContaCorrente;
import com.ContaPoupanca;

public class principal {
  public static void main(String[] args) {
    ContaCorrente CC = new ContaCorrente();
    CC.depositar(100);
    System.out.println("O saldo inicial da conta corrente é " + CC.getSaldo());

    CC.sacar(20);
    System.out.println("O saldo atual da conta corrente é " + CC.getSaldo());

    ContaPoupanca CP = new ContaPoupanca();
    CP.depositar(100);
    System.out.println("O saldo inicial da conta poupança é " + CC.getSaldo());

    CP.sacar(20);
    System.out.println("O saldo atual da conta poupança é " + CC.getSaldo());
  }
}
