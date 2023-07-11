package com;

public abstract class Conta {

  protected double saldo;

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public abstract void sacar(double valor);

  public double getSaldo() {
    return this.saldo;
  }
}
