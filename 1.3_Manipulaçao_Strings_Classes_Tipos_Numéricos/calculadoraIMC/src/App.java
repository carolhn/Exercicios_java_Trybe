import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    String nota = scanner.next();

    System.out.println("Digite o nome da atividade N:");
    String nomeAtividade = scanner.next();

    System.out.println("Digite o peso da atividade N:");
    String pesoAtividade = scanner.next();

    double calculaNota = Double.parseDouble(nota);
    double calculaPeso = Double.parseDouble(pesoAtividade);

    Atividades instanciaAtividade = new Atividades();
    instanciaAtividade.calculaNotas(calculaNota, calculaPeso);
    scanner.close();
  }
}