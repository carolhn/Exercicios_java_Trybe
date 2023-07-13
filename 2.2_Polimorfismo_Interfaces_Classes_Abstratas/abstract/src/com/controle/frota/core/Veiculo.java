package com.controle.frota.core;
import java.util.ArrayList;
public abstract class Veiculo {
  private String placa;
  private int anoFabricacao;
  private String combustivel;
  protected ArrayList<String> abastecimentos;

  public Veiculo(String placa, int anoFabricacao) {
    this.placa = placa;
    this.anoFabricacao = anoFabricacao;
    this.abastecimentos = new ArrayList<>();
  }
  public void abastecer(String local, String motorista, double valor) {

    public void listaAbastecimentos() {
      System.out.println("-------Lista de abastecimentos para veiculo: " + this.placa + "--------");
      for (String abastecimento : this.abastecimentos) {
        System.out.println("|" + abastecimento + "\t|");
      }
      System.out.println("---------------------FIM--------------------------");
    }
  }
}
