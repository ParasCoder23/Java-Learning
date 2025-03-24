package projectquiz;

public class Main {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.playQuiz();
        qs.calculateScore();
    }
}

class QuestionService{
    void playQuiz(){}
    void calculateScore(){}
}