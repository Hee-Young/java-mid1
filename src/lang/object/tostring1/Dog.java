package lang.object.tostring1;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age){
        this.dogName = dogName;
        this.age = age;
    }

    // 단축키 : command + N
    @Override
    public String toString() {
        return "Dog{" +
            "dogName='" + dogName + '\'' +
            ", age=" + age +
            '}';
    }
}
