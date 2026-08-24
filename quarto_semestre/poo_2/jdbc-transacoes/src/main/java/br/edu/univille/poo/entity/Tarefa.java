package br.edu.univille.poo.entity;

import java.time.LocalDateTime;

public class Tarefa {
    private int id;
    private String descricao;
    private Prioridade prioridade;
    private boolean feito;
    private LocalDateTime prazoFinal;

    public Tarefa() {}

    public Tarefa(int id, String descricao, Prioridade prioridade, boolean feito, LocalDateTime prazoFinal) {
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.feito = feito;
        this.prazoFinal = prazoFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }

    public LocalDateTime getPrazoFinal() {
        return prazoFinal;
    }

    public void setPrazoFinal(LocalDateTime prazoFinal) {
        this.prazoFinal = prazoFinal;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", prioridade=" + prioridade +
                ", feito=" + feito +
                ", prazoFinal=" + prazoFinal +
                '}';
    }
}
