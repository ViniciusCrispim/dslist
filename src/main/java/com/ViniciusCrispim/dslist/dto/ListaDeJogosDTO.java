package com.ViniciusCrispim.dslist.dto;

import com.ViniciusCrispim.dslist.entities.ListaDeJogosEntity;

public class ListaDeJogosDTO {

    private Long id;
    private String nome;

    public ListaDeJogosDTO() {}

    public ListaDeJogosDTO(ListaDeJogosEntity listaDeJogos) {
        id = listaDeJogos.getId();
        nome = listaDeJogos.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
