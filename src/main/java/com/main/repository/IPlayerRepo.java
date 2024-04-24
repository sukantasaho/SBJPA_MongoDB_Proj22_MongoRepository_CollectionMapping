package com.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import com.main.document.PlayerInfo;
 

public interface IPlayerRepo  extends MongoRepository<PlayerInfo, Integer>, CrudRepository<PlayerInfo, Integer>
{ 
}
