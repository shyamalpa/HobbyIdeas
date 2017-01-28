package com.math.quiz;

public class LevelInfo {
	private int level;
	private String levelInfo;
	public int getLevel() {
		return level;
	}
	public String getLevelInfo() {
		return levelInfo;
	}
	LevelInfo(int level,String levelInfo){
		this.level = level;
		this.levelInfo = levelInfo;
	}
}
