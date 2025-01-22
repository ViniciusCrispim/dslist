package com.ViniciusCrispim.dslist.repositories;

import com.ViniciusCrispim.dslist.entities.JogoEntity;
import com.ViniciusCrispim.dslist.projections.JogoMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JogoRespository extends JpaRepository<JogoEntity, Long> {
    @Query(nativeQuery = true, value = """
        SELECT tb_jogos.id, tb_jogos.titulo, tb_jogos.ano, tb_jogos.img_url AS imgUrl,
  		tb_jogos.descricao_curta AS descricaoCurta, tb_lista_pertencente.posicao
  		FROM tb_jogos
  		INNER JOIN tb_lista_pertencente ON tb_jogos.id = tb_lista_pertencente.jogo_id
  		WHERE tb_lista_pertencente.lista_id = :listaId
  		ORDER BY tb_lista_pertencente.posicao""")
    List<JogoMinProjection> buscarPorLista(Long listaId);
}
