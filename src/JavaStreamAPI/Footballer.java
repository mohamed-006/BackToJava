package JavaStreamAPI;

import java.util.List;

public class Footballer {
    private String name;
    private int age;
    private Gender gender;
    private List<String> positions;

    public Footballer(String name, int age, Gender gender, List<String> positions) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.positions = positions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", positions=" + positions +
                '}';
    }
}
