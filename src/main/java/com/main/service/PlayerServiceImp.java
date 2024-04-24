package com.main.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.document.PlayerInfo;
import com.main.repository.IPlayerRepo;

@Service("empService")
public class PlayerServiceImp implements IPlayerMgntService {

	@Autowired
	private IPlayerRepo repo;

	@Override
	public String registerPlayer(PlayerInfo info) {
		  
		return "Palyer Information is Saved With Id-"+repo.save(info).getPid();
	}

	@Override
	public List<PlayerInfo> showAllPlayersInfo() 
	{
		return repo.findAll();
	}
	
	
	 
}
