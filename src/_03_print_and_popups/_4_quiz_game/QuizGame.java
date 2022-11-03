package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question1 = JOptionPane.showInputDialog("What is 1 plus 1?");
				// 2.  Ask the user a question 
		if(question1.contentEquals("2")){
			score+=1;
		} else {
			score-=1;
		}
				// 3.  Use an if statement to check if their answer is correct
		String question2 = JOptionPane.showInputDialog("What is the best kind of cheese?");
				// 4.  if the user's answer was correct, add one to their score 
		if(question2.contentEquals("Parmesean")) {
			score+=1;
		} else {
			score-=1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String question3 = JOptionPane.showInputDialog("What is the most widely used search engine?");
		if(question3.contentEquals("Google")) {
			score +=1;
		} else {
			score-=1;
		}
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
