package com.ViniciusCrispim.dslist.services;

import com.ViniciusCrispim.dslist.dto.ListaDeJogosDTO;
import com.ViniciusCrispim.dslist.entities.ListaDeJogosEntity;
import com.ViniciusCrispim.dslist.projections.JogoMinProjection;
import com.ViniciusCrispim.dslist.repositories.JogoRespository;
import com.ViniciusCrispim.dslist.repositories.ListaDeJogosRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListaDeJogosService {

    @Autowired
    ListaDeJogosRespository listaDeJogosRespository;

    @Autowired
    JogoRespository jogoRespository;

    public List<ListaDeJogosDTO> buscarListaDeJogos() {
        List<ListaDeJogosEntity> jogos = listaDeJogosRespository.findAll();
        return jogos.stream().map(ListaDeJogosDTO::new).toList();
    }

    @Transactional
    public void moverNaLista(Long listaId, int posicaoOrigem, int posicaoDestino) {
        List<JogoMinProjection> lista = jogoRespository.buscarPorLista(listaId);
        JogoMinProjection jogo = lista.remove(posicaoOrigem);
        lista.add(posicaoDestino, jogo);

        int min = posicaoOrigem < posicaoDestino ? posicaoOrigem : posicaoDestino;
        int max = posicaoOrigem > posicaoDestino ? posicaoOrigem : posicaoDestino;

        for(int i = min; i <= max; i++) {
            listaDeJogosRespository.atualizarPosicaoNaLista(listaId, lista.get(i).getId(), i);
        }
    }
}
