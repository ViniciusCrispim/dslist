package com.ViniciusCrispim.dslist.services;

import com.ViniciusCrispim.dslist.dto.ListaDeJogosDTO;
import com.ViniciusCrispim.dslist.entities.ListaDeJogosEntity;
import com.ViniciusCrispim.dslist.repositories.ListaDeJogosRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaDeJogosService {

    @Autowired
    ListaDeJogosRespository listaDeJogosRespository;

    public List<ListaDeJogosDTO> buscarListaDeJogos() {
        List<ListaDeJogosEntity> jogos = listaDeJogosRespository.findAll();
        return jogos.stream().map(ListaDeJogosDTO::new).toList();
    }
}
