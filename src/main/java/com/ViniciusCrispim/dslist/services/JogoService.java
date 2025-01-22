package com.ViniciusCrispim.dslist.services;

import com.ViniciusCrispim.dslist.dto.JogoDTO;
import com.ViniciusCrispim.dslist.dto.JogoMinDTO;
import com.ViniciusCrispim.dslist.entities.JogoEntity;
import com.ViniciusCrispim.dslist.repositories.JogoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JogoService {
    @Autowired
    JogoRespository jogoRespository;

    @Transactional(readOnly = true)
    public List<JogoMinDTO> listarJogos(){
        List<JogoEntity> jogos = jogoRespository.findAll();
        // List<JogoMinDTO> jogosDTO = jogos.stream().map(x -> new JogoMinDTO(x)).toList();
        return jogos.stream().map(JogoMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public JogoDTO buscarJogoPorId(Long id){
        JogoEntity jogo = jogoRespository.findById(id).get();
        return new JogoDTO(jogo);
    }
}
