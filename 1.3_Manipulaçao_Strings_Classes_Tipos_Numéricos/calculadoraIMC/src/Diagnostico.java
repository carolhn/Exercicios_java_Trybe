import java.util.Scanner;
public class Diagnostico {
    public static void main(String[] args) {
      Scanner input1 = new Scanner(System.in);

      System.out.println("qual o seu peso?");
      String peso = input1.next();

      System.out.println("qual o seu altura?");
      String altura = input1.next();

      double calculaPeso = Double.parseDouble(peso);
      double calculaAltura = Double.parseDouble(altura);

      Avaliacao instanciaDeAvaliacao = new Avaliacao();
      instanciaDeAvaliacao.calculaIMC(calculaPeso, calculaAltura);
      input1.close();
    }
}
