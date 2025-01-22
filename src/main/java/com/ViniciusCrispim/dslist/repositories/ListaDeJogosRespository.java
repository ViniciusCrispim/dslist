package com.ViniciusCrispim.dslist.repositories;

import com.ViniciusCrispim.dslist.entities.ListaDeJogosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaDeJogosRespository extends JpaRepository<ListaDeJogosEntity, Long> {
}
