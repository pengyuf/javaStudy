package StudentManager;

public class Student {
    private String name;
    private int age;
    private String id;
    private int score;

    // 构造方法
    public Student(String id, String name, int age, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter/setter
    public String getId() {
        return id; // 可以写this.id吗
    }

    public void setId(String id) {
        this.id = id;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + "|" + score;
    }
}
