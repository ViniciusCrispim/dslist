package com.ViniciusCrispim.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable //Representa dois campos na tabela
public class ListaPertencentePK {

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private JogoEntity jogo;
    @ManyToOne
    @JoinColumn(name = "lista_id")
    private JogoLista lista;

    public ListaPertencentePK() {}

    public ListaPertencentePK(JogoEntity jogo, JogoLista lista) {
        this.jogo = jogo;
        this.lista = lista;
    }

    public JogoEntity getJogo() {
        return jogo;
    }

    public void setJogo(JogoEntity jogo) {
        this.jogo = jogo;
    }

    public JogoLista getLista() {
        return lista;
    }

    public void setLista(JogoLista lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListaPertencentePK that = (ListaPertencentePK) o;
        return Objects.equals(jogo, that.jogo) && Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jogo, lista);
    }
}
