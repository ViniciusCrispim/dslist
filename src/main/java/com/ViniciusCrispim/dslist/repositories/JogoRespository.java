package com.ViniciusCrispim.dslist.repositories;

import com.ViniciusCrispim.dslist.entities.JogoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRespository extends JpaRepository<JogoEntity, Long> {
}
