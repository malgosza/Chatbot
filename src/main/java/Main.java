import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question question1 = new Question(1, "Jak sie masz?", null);
        Question question2 = new Question(2, "Co robiłeś dziś?", 1);
        Question question3 = new Question(3, "Co można poprawić?", 2);
        Question question4 = new Question(4, "Jutro bedzie lepiej. Moze cos porobimy?", 3);
        Question question5 = new Question(5, "Duzo zjadles??", 4);

        Answer answer1 = new Answer(1, "OK", 1);
        Answer answer2 = new Answer(2, "Mogloby byc lepiej", 1);
        Answer answer3 = new Answer(3, "Fatalnie", 1);

        Answer answer4 = new Answer(4, "jadlem", 2);
        Answer answer5 = new Answer(5, "spalem", 2);
        Answer answer6 = new Answer(6, "grałem", 2);

        Answer answer7 = new Answer(7, "tak", 5);
        Answer answer8 = new Answer(8, "nie", 5);

        List<Question> questions = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);

        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);

        answers.add(answer4);
        answers.add(answer5);
        answers.add(answer6);

        answers.add(answer7);
        answers.add(answer8);

        int idQuestion = 0;
        Integer idAnswer;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).idAnswer == null) {
                idQuestion = questions.get(i).idQuestion;
                System.out.println(questions.get(i).question);
            }
        }

        do {
            for (int i = 0; i < answers.size(); i++) {
                if (answers.get(i).idQuestion == idQuestion) {
                    System.out.println(answers.get(i).answer + " [" + answers.get(i).idAnswer + "]");
                }
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Ktora odpowiedz: ");
            idAnswer = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < questions.size(); i++) {
                Integer xd = questions.get(i).idAnswer;
                if (xd == idAnswer) {
                    idQuestion = questions.get(i).idQuestion;
                    System.out.println(questions.get(i).question);
                }
            }
        }while (answers.get(idAnswer).idQuestion!=null);
    }
}