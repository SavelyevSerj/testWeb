package model;

/**
 * Created by BigBadVoodooDaddy on 30.09.2017.
 */
public class Variant {

    //fields
    private String answer;
    private boolean correct;

    // Constructor#1
    public Variant(String answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public Variant(String answer) {
        correct = answer.startsWith("+"); // поле correct = true, если строка answer начинается с символа "+"
        this.answer = correct ? answer.substring(1) : answer;// если поле correct = true, то поле answer равно подстроке без первого символа.
    }


    //getters only. Пишем только getters, т.к. данные поля прописаны в файле, а мы не хотим чтобы они могли быть кем-то изменены.
    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }
}
