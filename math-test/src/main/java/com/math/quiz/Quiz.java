package com.math.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private List<Question> questions;
	public List<Question> getQuestions() {
		return questions;
	}
	public void addQuestion(Question question){
		questions.add(question);
	}
	Quiz(){
		questions = new ArrayList<Question>();
	}
	
}
