package com.main.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Document(collection = "PLAYER_INFO")
@Data
@NoArgsConstructor
public class PlayerInfo {

	@Id
	private Integer pid;
	private String pname;
	private String paddr;
	private String[] friends;
	private List<String> nickNames;
	private Set<Long> contactNumbers;
	private Map<String, Object> medalInfo;
	private Properties idDetails;
	
}
