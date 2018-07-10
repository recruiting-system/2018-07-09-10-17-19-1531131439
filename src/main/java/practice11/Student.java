package practice11;

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
        String tempString = "at Class "+klass.getNumber();
        if (klass.getLeader()!=null&&klass == klass.getLeader().getKlass()) {
            tempString = "Leader of Class "+klass.getNumber();
        }
        return super.introduce()+" I am a Student. I am "+tempString+".";
    }
}

