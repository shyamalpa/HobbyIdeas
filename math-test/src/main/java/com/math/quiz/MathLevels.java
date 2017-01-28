package com.math.quiz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MathLevels {
	private static  List<Level> levels;
	
	public static Level getMathLevel(int level){
		if(level >=levels.size())
		{
			return null;
		}
		return levels.get(level);
	}
	
	static
	{
		levels = new ArrayList<Level>();
		ClassLoader classLoader = MathLevels.class.getClassLoader();
		File file = new File(classLoader.getResource("MathLevels.json").getFile());

		ObjectMapper mapper = new ObjectMapper();
		try {
			
			levels = mapper.readValue(file, new TypeReference<List<Level>>(){});
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static  List<LevelInfo> getLevelInfo(){
		List<LevelInfo> retLevels = new ArrayList<LevelInfo>();
		Iterator<Level> iterator =  levels.iterator();
		while(iterator.hasNext()){
			Level level = iterator.next();
			retLevels.add(new LevelInfo(level.getLevel(),level.getLevelInfo()));
		}
		return retLevels;
	}

}
