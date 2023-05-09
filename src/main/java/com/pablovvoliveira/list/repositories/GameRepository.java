package com.pablovvoliveira.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablovvoliveira.list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
