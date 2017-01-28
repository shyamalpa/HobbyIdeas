package com.math.quiz;

import java.util.Random;


public class QuizGenerator {
	
	public Quiz GenrateQuiz(ArithmeticOperator operator,int levelVal,int noQuestions)
	{
		Quiz quiz = new Quiz();
		Level level = MathLevels.getMathLevel(levelVal-1);
		for  (int i =0;i<noQuestions;i++){
			Question question = new Question();
			question.setLeftOperand(getRandomNumberInRange(level.getLeftOperandMinLimit(), level.getLeftOperandMaxLimit()));
			question.setRightOperand(getRandomNumberInRange(level.getRightOperandMinLimit(), level.getRightOperandMaxLimit()));
			question.setOperand(operator.operator());
			question.setResult(operator.result(question.getLeftOperand(), question.getRightOperand()));
			quiz.addQuestion(question);
		}
		return quiz;
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
