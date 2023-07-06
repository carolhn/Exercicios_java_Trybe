public class app {
  public static void main(String[] args) {
    String info = "testando@aqui.com;outroteste2@gmail.com;a;De {de} para {para};Bom dia amigo";
    Email email = new Email();
    email.enviarEmail(info);
  }
}
