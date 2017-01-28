package com.math.quiz;

public enum ArithmeticOperator {
	ADDITION("+",new ArithmeticOperation() {
	      public int evaluate(int leftOperand,int rightOperand) {
	          return leftOperand+rightOperand;
	        }}),
	SUBSTRACTION("-",new ArithmeticOperation() {
	      public int evaluate(int leftOperand,int rightOperand) {
	          return leftOperand-rightOperand;
	        }}),
	DIVISION("/",new ArithmeticOperation() {
	      public int evaluate(int leftOperand,int rightOperand) {
	          return leftOperand/rightOperand;
	        }}),
	MULTIPLICATION("*",new ArithmeticOperation() {
	      public int evaluate(int leftOperand,int rightOperand) {
	          return leftOperand*rightOperand;
	        }});
	
	ArithmeticOperator(String operator,ArithmeticOperation arithOp){
		this.operator = operator;
		this.arithOp = arithOp;
	}
	private final String operator;
	private final ArithmeticOperation arithOp;
	public String operator(){return operator;}
	public int result(int leftOperand,int rightOperand){
		return arithOp.evaluate(leftOperand, rightOperand);
	}
	public String getMenu(){
		return this.toString().toLowerCase()+"("+this.operator+")";
	}
}
