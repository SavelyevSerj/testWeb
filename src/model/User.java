package model;

/**
 * Created by BigBadVoodooDaddy on 30.09.2017.
 */
public class User {
    //fields
    private String name;
    private String groupNumber;

    //Конструктор1
    public User() {
    }

    //Конструктор2
    public User(String name, String groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
}
