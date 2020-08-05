import java.util.ArrayList;
import java.util.List;

public class Conversation {
    List<Question> questions;
    List<Answer> answers;

    public Conversation(List<Question> questions,List<Answer> answers){
        this.questions=questions;
        this.answers=answers;
    }

    public List<String> getAnswersToQuestion(Integer currentIdQuestion){

        List<String> answersToQuestion=new ArrayList<>();

        for (Answer answer : answers) {
            if (answer.idPrevQuestion.equals(currentIdQuestion)) {
                answersToQuestion.add(answer.answer + " [" + answer.idAnswer + "]");
            }
        }

        return answersToQuestion;
    }

    public String getCurrentQuestion(Integer idQuestion){
        for (Question question : questions) {
            if (question.idQuestion.equals(idQuestion)) {
                return question.question;
            }
        }
        return "";
    }
}
