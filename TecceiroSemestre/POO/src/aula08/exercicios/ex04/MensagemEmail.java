package aula08.exercicios.ex04;

public class MensagemEmail {
    private String destinatario;
    private String assunto;
    private String texto;

// Constructor
    public MensagemEmail(String destinatario, String assunto, String texto) {
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.texto = texto;
    }

// Getters
    public String getDestinatario() {
        return destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getTexto() {
        return texto;
    }

}
