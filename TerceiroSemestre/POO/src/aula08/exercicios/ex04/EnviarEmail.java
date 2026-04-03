package aula08.exercicios.ex04;

public class EnviarEmail {
    public void enviar(MensagemEmail mensagem) {
        System.out.println("Destinatário: " + mensagem.getDestinatario());
        System.out.println("Assunto: " + mensagem.getAssunto());
        System.out.println("Texto: " + mensagem.getTexto());
    }
}
