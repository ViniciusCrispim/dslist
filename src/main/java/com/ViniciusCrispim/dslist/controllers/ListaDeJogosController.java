package com.ViniciusCrispim.dslist.controllers;

import com.ViniciusCrispim.dslist.dto.ListaDeJogosDTO;
import com.ViniciusCrispim.dslist.services.ListaDeJogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/listas")
public class ListaDeJogosController {
    @Autowired
    ListaDeJogosService listaDeJogosService;

    @GetMapping
    public List<ListaDeJogosDTO> buscarListasDeJogos(){
        return listaDeJogosService.buscarListaDeJogos();
    }
}
