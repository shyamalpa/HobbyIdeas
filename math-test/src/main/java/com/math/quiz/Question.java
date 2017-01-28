package com.math.quiz;

public class Question {
	private int leftOperand;
	public int getLeftOperand() {
		return leftOperand;
	}
	public void setLeftOperand(int leftOperand) {
		this.leftOperand = leftOperand;
	}
	public int getRightOperand() {
		return rightOperand;
	}
	public void setRightOperand(int rightOperand) {
		this.rightOperand = rightOperand;
	}
	public String getOperand() {
		return operator;
	}
	public void setOperand(String operand) {
		this.operator = operand;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	private int rightOperand;
	private String operator;
	private int result;

}
