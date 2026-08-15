package br.edu.univille.poo.entity;

import java.time.LocalDateTime;

public class Tarefa {
    private int id;
    private String descricao;
    private Prioridade prioridade;
    private boolean feito;
    private LocalDateTime prazoFinal;
}
