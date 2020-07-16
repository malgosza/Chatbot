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

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).idPrevQuestion == currentIdQuestion) {
                answersToQuestion.add(answers.get(i).answer + " [" + answers.get(i).idAnswer + "]");
            }
        }

        return answersToQuestion;
    }

    public String getCurrentQuestion(Integer idQuestion){

        String textQuestion = "";

        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).idQuestion == idQuestion) {
                textQuestion=questions.get(i).question;
                break;
            }
        }
        return textQuestion;
    }
}
