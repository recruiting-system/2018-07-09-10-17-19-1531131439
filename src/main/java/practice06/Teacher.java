package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass =klass;
    }

    @Override
    public String introduce() {
        String temString = " I teach No Class.";
        if(klass!=0){
            temString = " I teach Class "+klass+".";
        }
        return super.introduce()+" I am a Teacher." +temString;
    }
}
