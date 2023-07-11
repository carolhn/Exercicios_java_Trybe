package com;

public class ContaCorrente extends Conta {
  @Override
  public void sacar(double valor) {
    this.saldo -= valor + (valor * 0.05);
  }
}
