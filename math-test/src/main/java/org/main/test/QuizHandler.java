package org.main.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.math.quiz.ArithmeticOperator;
import com.math.quiz.LevelInfo;
import com.math.quiz.MathLevels;
import com.math.quiz.Question;
import com.math.quiz.Quiz;
import com.math.quiz.QuizGenerator;

public class QuizHandler {

	public static void main(String[] args) {
		char wannaPlayMore ='Y';
		Scanner in = new Scanner(System.in);
		while (wannaPlayMore =='y' || wannaPlayMore =='Y'){
			for(ArithmeticOperator op : ArithmeticOperator.values())
			{
				System.out.println(op.getMenu());
			}
			List<LevelInfo> levelList = MathLevels.getLevelInfo();
			Iterator<LevelInfo> iter = levelList.iterator();
			System.out.println("Level");
			while(iter.hasNext()){
				LevelInfo levInfo = iter.next();
				System.out.println("<"+levInfo.getLevel()+"> "+levInfo.getLevelInfo());
			}
			System.out.println("Select Level:");

			int level = in.nextInt();
			QuizGenerator qg = new QuizGenerator();
			Quiz q = qg.GenrateQuiz(ArithmeticOperator.ADDITION, level, 10);
			List<Question> questions= q.getQuestions();
			Iterator<Question> qIter = questions.iterator();
			int score = 0;
			while(qIter.hasNext())
			{
				Question quest = qIter.next();
				System.out.println(quest.getLeftOperand()+" " + quest.getOperand() + " "+ quest.getRightOperand() + "  = ");
				int result = in.nextInt();
				if(result == quest.getResult())
				{
					System.out.println("Awesome,that's the right answer");
					score++;
				}
				else
				{
					System.out.println("Oh,that's incorrect, The right answer is "+ quest.getResult());
				}	
			}
			System.out.println("Congraulations you scored "+score+"/"+questions.size());
			System.out.println("Want to play more?");
			wannaPlayMore = in.next(".").charAt(0);
		}
		in.close();
	}
}
