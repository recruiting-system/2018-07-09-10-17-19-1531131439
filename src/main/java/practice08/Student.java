package practice08;

public class Student extends Person {
    private Klass klass;

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }



    @Override
    public String introduce() {
        if (klass != klass.getLeader().getKlass()) {
            return super.introduce()+" I am a Student. I am Leader of Class "+klass.getNumber()+".";
        } else {
            return "";
        }

    }
}