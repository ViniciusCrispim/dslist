package com.ViniciusCrispim.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable //Representa dois campos na tabela
public class ListaPertencentePKEntity {

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private JogoEntity jogo;
    @ManyToOne
    @JoinColumn(name = "lista_id")
    private ListaDeJogosEntity lista;

    public ListaPertencentePKEntity() {}

    public ListaPertencentePKEntity(JogoEntity jogo, ListaDeJogosEntity lista) {
        this.jogo = jogo;
        this.lista = lista;
    }

    public JogoEntity getJogo() {
        return jogo;
    }

    public void setJogo(JogoEntity jogo) {
        this.jogo = jogo;
    }

    public ListaDeJogosEntity getLista() {
        return lista;
    }

    public void setLista(ListaDeJogosEntity lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListaPertencentePKEntity that = (ListaPertencentePKEntity) o;
        return Objects.equals(jogo, that.jogo) && Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jogo, lista);
    }
}
