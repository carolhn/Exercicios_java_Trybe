public class Email {
    public void enviarEmail(String email) {

      String[] campos = email.split(";");
      String de = campos[0];
      String para = campos[1];
      String copiaOcultaPara = "";
      String assunto = campos[3];
      String mensagem = campos[4];

      // corrigir o campo copia oculta
      if ("AEIOU".indexOf(campos[2].toUpperCase()) >= 0) {
        copiaOcultaPara = "diretor@dafirma.com";
      }

      // corrigir o assunto
      assunto = assunto.replace("{de}", de);
      assunto = assunto.replace("{para}", para);

      System.out.println("De:" + de + "\n" +
          "Para:" + para + "\n" +
          "CC:" + copiaOcultaPara + "\n" +
          "Assunto:" + assunto + "\n" +
          "Mensagem:" + mensagem + "\n");
    }
}
