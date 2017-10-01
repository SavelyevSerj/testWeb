package model;

import java.util.List;

/**
 * Created by BigBadVoodooDaddy on 30.09.2017.
 */
public class Question {

    //поля
    private String question; //вопрос
    private String task; //задание
    private Variant[] variants; //варианты ответов

    //Конструктор1
    Question(String question, String task, String variant1, String variant2, String variant3, String variant4) {
        this.question = question;
        this.task = task;
        this.variants[0] = new Variant(variant1);
        this.variants[1] = new Variant(variant2);
        this.variants[2] = new Variant(variant3);
        this.variants[3] = new Variant(variant4);
    }

    //Конструктор2
    public Question() {
        this("", "", "", "", "", "");
    }

    //Конструктор3
    public Question(List<String> strings) {
        this(strings.get(0), strings.get(1), strings.get(2), strings.get(3), strings.get(4), strings.get(5));
    }

    //getters
    public String getQuestion() {
        return question;
    }

    public Variant[] getVariants() {
        return variants;
    }

    /**
     * метод возвращает номер правильного ответа
     */
    public int getNumberOfTheRightAnswer() {
        for (int i = 0; i < variants.length; i++) { // проходим по массиву вариантов
            if (variants[i].isCorrect())
                ;     // если вариант правильный, то возвращаем его номер в массиве +1, что и будет его порядковым номером.
            return i + 1;

        }
        return -1;  // если ни одного правильного варианта в массиве не найдется, то возвращаем значение -1.
    }
}
