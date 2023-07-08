import java.lang.Math;
public class Avaliacao {
  public void calculaIMC(double peso, double altura) {
    double imc = peso / Math.pow(altura, 2);
    System.out.println("O seu IMC é" + imc);
  }
}
