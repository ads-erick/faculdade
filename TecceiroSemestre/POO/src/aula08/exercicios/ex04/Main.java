package aula08.exercicios.ex04;

public class Main {
    public static void main(String[] args) {
        MensagemEmail mensagem1 = new MensagemEmail("erick.ads@outlook.com", "Teste de e-mail", "Olá! Estou enviando essa mensagem para testar a classe.");
        EnviarEmail mensagem = new EnviarEmail();
        mensagem.enviar(mensagem1);
    }
}
