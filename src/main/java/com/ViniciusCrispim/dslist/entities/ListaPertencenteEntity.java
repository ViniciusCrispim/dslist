package com.ViniciusCrispim.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_lista_pertencente")
public class ListaPertencenteEntity {

    //Representa chave primária múltipla
    @EmbeddedId
    private ListaPertencentePKEntity id = new ListaPertencentePKEntity();

    private Integer posicao;

    public ListaPertencenteEntity() {}

    public ListaPertencenteEntity(JogoEntity jogo, ListaDeJogosEntity lista, Integer posicao) {
        id.setJogo(jogo);
        id.setLista(lista);
        this.posicao = posicao;
    }

    public ListaPertencentePKEntity getId() {
        return id;
    }

    public void setId(ListaPertencentePKEntity id) {
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
        ListaPertencenteEntity that = (ListaPertencenteEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
