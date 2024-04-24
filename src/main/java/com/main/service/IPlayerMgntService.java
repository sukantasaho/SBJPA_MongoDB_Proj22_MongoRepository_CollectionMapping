package com.main.service;

import java.util.List;

import com.main.document.PlayerInfo;

public interface IPlayerMgntService 
{
     public String registerPlayer(PlayerInfo info);
     public List<PlayerInfo> showAllPlayersInfo();
}
