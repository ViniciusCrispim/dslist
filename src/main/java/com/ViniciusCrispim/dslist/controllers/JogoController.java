package com.ViniciusCrispim.dslist.controllers;

import com.ViniciusCrispim.dslist.dto.JogoMinDTO;
import com.ViniciusCrispim.dslist.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {
    @Autowired
    JogoService jogoService;

    @GetMapping
    public List<JogoMinDTO> listarJogos(){
        return jogoService.listarJogos();
    }
}
