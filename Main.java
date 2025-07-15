
import java.util.Scanner;

class Question {
    String question; // question should be in string format
    String[] options; // options are multiple to store it we use String array
    int correctAnswerIndex; // out of 4 options 1 is correct so we store that index in int 

    public Question(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }  //all the values are assigned here by constructor

    public boolean isCorrect(int answerIndex) {   //it only returns true or false  
        return answerIndex == correctAnswerIndex;
    }
}

public class Main {                                         // add public for iDEs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//the below is array of class which holda all the variables of that class
        Question[] questions = new Question[] {
            new Question("What is the capital of India?", new String[] {"Delhi", "Mumbai", "Kolkata", "Chennai"}, 0),
            new Question("Who is the founder of Microsoft?", new String[] {"Steve Jobs", "Bill Gates", "Elon Musk", "Mark Zuckerberg"}, 1),
            new Question("What is 10 + 20?", new String[] {"20", "30", "40", "50"}, 1),
            new Question("Where is Bangalore", new String[] {"Karnataka", "Kerala", "Andhra", "Assam"}, 0),
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Q" + (i + 1) + ": " + q.question); // first we need question to be genarated

            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]); // next the options 
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt(); // our entered answer is stored in userAnswer and checked with is correct function

            if (q.isCorrect(userAnswer - 1)) { // since options are stored in array , -1 , if true then enters in
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.options[q.correctAnswerIndex] + "\n");
            }
        }

        System.out.println("Your final score: " + score + " out of " + questions.length);
        scanner.close();
    }
}

