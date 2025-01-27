package com.ViniciusCrispim.dslist.dto;

public class ReposicionamentoDTO {
    private Integer posicaoOrigem;
    private Integer posicaoDestino;

    public ReposicionamentoDTO(Integer posicaoOrigem, Integer posicaoDestino) {
        this.posicaoOrigem = posicaoOrigem;
        this.posicaoDestino = posicaoDestino;
    }

    public Integer getPosicaoOrigem() {
        return posicaoOrigem;
    }

    public void setPosicaoOrigem(Integer posicaoOrigem) {
        this.posicaoOrigem = posicaoOrigem;
    }

    public Integer getPosicaoDestino() {
        return posicaoDestino;
    }

    public void setPosicaoDestino(Integer posicaoDestino) {
        this.posicaoDestino = posicaoDestino;
    }
}
