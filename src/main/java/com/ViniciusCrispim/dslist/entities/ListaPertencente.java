package com.ViniciusCrispim.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_lista_pertencente")
public class ListaPertencente {

    //Representa chave primária múltipla
    @EmbeddedId
    private ListaPertencentePK id = new ListaPertencentePK();

    private Integer posicao;

    public ListaPertencente() {}

    public ListaPertencente(JogoEntity jogo, JogoLista lista, Integer posicao) {
        id.setJogo(jogo);
        id.setLista(lista);
        this.posicao = posicao;
    }

    public ListaPertencentePK getId() {
        return id;
    }

    public void setId(ListaPertencentePK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListaPertencente that = (ListaPertencente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
