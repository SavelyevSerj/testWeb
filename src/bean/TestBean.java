package bean;

import model.Question;
import model.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BigBadVoodooDaddy on 30.09.2017.
 */
@ManagedBean
@SessionScoped
public class TestBean implements Serializable {

    //поля
    private static final String DIR = "E:\\Documents2\\Programming\\Berkunskiy-programming\\Projects\\Trainning\\testWeb(5)";
    private User user = new User(); // пользователь, который зарегистрировался
    private Question currentQuestion; // текущий вопрос
    private int numberOfTheCurrentQuestion; // номер текущего вопроса

    //списки
    private List<Question> questions; //общий список вопросов
    private List<Question> subQuestionList; //подсписок вопросов для тестирования одного пользователя
    private List<Integer> rightAnswers; //список правильных ответов
    private List<Integer> usersAnswers; // список ответов пользователя

    //getter и setter для зарегестрировавшегося пользователя
    public User getUser() {
        return user;
    }

    public void setUser() {
        this.user = user;
    }

    //getter для currentQuestion
    public Question getCurrentQuestion() {
        return subQuestionList.get(numberOfTheCurrentQuestion - 1);
    }

    /*
    * Возвращает имя файла, в котором хранится вся информация для тестирования
    * */

    private static String getFileName() {
        return "questions.csv";
    }

    /*
    * 1) Создает три два списка: общий список вопросов, подсписок вопросов для тестирования, список правильных ответов
    * 2) Читает вопросы, условия и варианты ответов из файла на компьютере
    **/
    @PostConstruct
    public void init() {
        questions = new ArrayList<>();
        rightAnswers = new ArrayList<>();
        usersAnswers = new ArrayList<>();



    }

}
