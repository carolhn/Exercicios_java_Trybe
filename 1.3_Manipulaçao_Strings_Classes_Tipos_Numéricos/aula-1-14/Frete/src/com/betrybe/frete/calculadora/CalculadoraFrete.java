package com.betrybe.frete.calculadora;

public class CalculadoraFrete {

    public double fretePorDistanciaPeso(int distancia, double peso) {
        if (distancia < 10) {
            return 0;
        } else if (distancia >= 10 && distancia < 50) {
            return 1.5 * peso;
        } else {
            return 5 * peso;
        }
    }

    public double fretePorFaixaDePreco(double precoBase) {
        if (precoBase <= 100) {
            return 0.10 * precoBase;
        } else if (precoBase <= 1000) {
            return 0.05 * precoBase;
        } else {
            return 0.02 * precoBase;
        }
    }
}
