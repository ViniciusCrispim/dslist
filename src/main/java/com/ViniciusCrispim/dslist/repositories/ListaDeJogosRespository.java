package com.ViniciusCrispim.dslist.repositories;

import com.ViniciusCrispim.dslist.entities.ListaDeJogosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ListaDeJogosRespository extends JpaRepository<ListaDeJogosEntity, Long> {
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_lista_pertencente SET posicao = :novaPosicao WHERE lista_id = :listaId AND jogo_id = :jogoId")
    void atualizarPosicaoNaLista(Long listaId, Long jogoId, Integer novaPosicao);
}
