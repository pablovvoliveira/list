package com.pablovvoliveira.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablovvoliveira.list.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
