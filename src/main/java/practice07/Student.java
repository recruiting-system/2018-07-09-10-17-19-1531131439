package practice07;

public class Student extends Person {
    private Klass klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass kclass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }



    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class "+this.klass.getNumber()+".";
    }
}