package com.math.quiz;

public class Level {
	private int level;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getLevelInfo() {
		return levelInfo;
	}
	public void setLevelInfo(String levelInfo) {
		this.levelInfo = levelInfo;
	}
	public int getLeftOperandMinLimit() {
		return leftOperandMinLimit;
	}
	public void setLeftOperandMinLimit(int leftOperandMinLimit) {
		this.leftOperandMinLimit = leftOperandMinLimit;
	}
	public int getLeftOperandMaxLimit() {
		return leftOperandMaxLimit;
	}
	public void setLeftOperandMaxLimit(int leftOperandMaxLimit) {
		this.leftOperandMaxLimit = leftOperandMaxLimit;
	}
	public int getRightOperandMinLimit() {
		return rightOperandMinLimit;
	}
	public void setRightOperandMinLimit(int rightOperandMinLimit) {
		this.rightOperandMinLimit = rightOperandMinLimit;
	}
	public int getRightOperandMaxLimit() {
		return rightOperandMaxLimit;
	}
	public void setRightOperandMaxLimit(int rightOperandMaxLimit) {
		this.rightOperandMaxLimit = rightOperandMaxLimit;
	}
	private String levelInfo;
	private int leftOperandMinLimit;
	private int leftOperandMaxLimit;
	private int rightOperandMinLimit;
	private int rightOperandMaxLimit;

}
