package com.main.runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.main.document.PlayerInfo;
import com.main.service.IPlayerMgntService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPlayerMgntService service;
	
	@Override
	public void run(String... args) throws Exception {
		 
          try
          {
        	  // save single playerInfo
				/* Properties idDetails = new Properties();
				 idDetails.put("aadhar", 993999889949l);
				 idDetails.put("pan", "MZCPS1641E");
				 idDetails.put("voter", "hd773jjdj");
				 
				   PlayerInfo p1 = new PlayerInfo();
				   p1.setPid(new Random().nextInt(10000));
				   p1.setPname("Bikash Jena");
				   p1.setPaddr("Balesore,Bhadrak");
				   p1.setNickNames(List.of("biki","latu"));
				   p1.setContactNumbers(Set.of(8899399993l,933993330l,677377383l));
				   p1.setFriends(new String[] {"raju","denedra"});
				   p1.setMedalInfo(Map.of("inter college","1st prize","state","2nd prize"));
				   p1.setIdDetails(idDetails);
				   
				   String msg = service.registerPlayer(p1);
				   System.out.println(msg);*/
        	  
        	  //get All PlayersInfo
        	  service.showAllPlayersInfo().forEach(System.out::println);
        	    
        	    
          }
          catch (Exception e) {
			 e.printStackTrace();
		}
	}

}
