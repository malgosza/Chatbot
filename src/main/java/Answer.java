public class Answer {
    int idAnswer;
    String answer;
    Integer idPrevQuestion;
    Integer idNextQuestion;

    public Answer(int idAnswer,String answer,Integer idPrevQuestion, Integer idNextQuestion){
        this.idAnswer=idAnswer;
        this.answer=answer;
        this.idPrevQuestion=idPrevQuestion;
        this.idNextQuestion=idNextQuestion;
    }
}
