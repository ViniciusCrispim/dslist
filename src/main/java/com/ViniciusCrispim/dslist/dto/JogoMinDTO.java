package com.ViniciusCrispim.dslist.dto;

import com.ViniciusCrispim.dslist.entities.JogoEntity;

public class JogoMinDTO {
    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public JogoMinDTO() {}

    public JogoMinDTO(JogoEntity jogo) {
        id = jogo.getId();
        titulo = jogo.getTitulo();
        ano = jogo.getAno();
        imgUrl = jogo.getImgUrl();
        descricaoCurta = jogo.getDescricaoCurta();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
