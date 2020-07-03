import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question question1 = new Question(1, "Jak sie masz?");
        Question question2 = new Question(2, "Co robiłeś dziś?");
        Question question3 = new Question(3, "Co można poprawić?");
        Question question4 = new Question(4, "Jutro bedzie lepiej. Moze cos porobimy?");
        Question question5 = new Question(5, "Duzo zjadles?");
        Question question6 = new Question(6, "Aha to miłego dnia");

        Answer answer1 = new Answer(1, "OK", 1, 2);
        Answer answer2 = new Answer(2, "Mogloby byc lepiej", 1,3);
        Answer answer3 = new Answer(3, "Fatalnie", 1,4);

        Answer answer4 = new Answer(4, "jadlem", 2,5);
        Answer answer5 = new Answer(5, "spalem", 2,null);
        Answer answer6 = new Answer(6, "grałem", 2,null);

        Answer answer7 = new Answer(7, "tak", 5, null);
        Answer answer8 = new Answer(8, "nie", 5, null);

        Answer answer9 = new Answer(9, "nic", 3, null);
        Answer answer10 = new Answer(10, "wszystko", 3, null);

        Answer answer11 = new Answer(11, "tak", 4, null);
        Answer answer12 = new Answer(12, "nie", 4, null);

        List<Question> questions = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);

        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);

        answers.add(answer4);
        answers.add(answer5);
        answers.add(answer6);

        answers.add(answer7);
        answers.add(answer8);

        answers.add(answer9);
        answers.add(answer10);

        answers.add(answer11);
        answers.add(answer12);

        Integer idAnswer;

        Conversation conversation=new Conversation(questions, answers);
        System.out.println(conversation.getStartQuestion());

        Scanner scan = new Scanner(System.in);

        Integer idQuestion = conversation.getStartIdQuestion();
        do {
            for (int i = 0; i < conversation.getAnswersToQuestion(idQuestion).size(); i++) {
                System.out.println(conversation.getAnswersToQuestion(idQuestion).get(i));
            }
            System.out.println("Ktora odpowiedz: ");
            idAnswer = Integer.parseInt(scan.nextLine());//1
            idQuestion=answers.get(idAnswer-1).idNextQuestion;//2

            System.out.println(conversation.getCurrentQuestion(idQuestion));
            
        }while (answers.get(idAnswer-1).idNextQuestion!=null);
    }
}