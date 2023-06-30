import java.util.List;
public class MaiorQuantidadeVogais {
  public static String palavraComMaiorQuantidadeVogais(List<String> palavras) {
    String palavraComMaisVogais = null;
    int quantidadeVogais = 0;
    for (String palavra : palavras) {
      int qtdVogais = contarVogais(palavra);
      if (qtdVogais > quantidadeVogais) {
        quantidadeVogais = qtdVogais;
        palavraComMaisVogais = palavra;
      }
    }
    return palavraComMaisVogais;
  }
  private static int contarVogais(String palavra) {
    int qtdVogais = 0;
    for (int i = 0; i < palavra.length(); i++) {
      char c = Character.toLowerCase(palavra.charAt(i));
      if (c == ‘a’ || c == ‘e’ || c == ‘i’ || c == ‘o’ || c == ‘u’) {
        qtdVogais++;
      }
    }
    return qtdVogais;
  }
}