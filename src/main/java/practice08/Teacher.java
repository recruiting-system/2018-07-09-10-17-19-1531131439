package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    @Override
    public String introduce() {
        String temString = " I teach No Class.";
        if(klass.getNumber()!=0){
            temString = " I teach Class "+klass.getNumber()+".";
        }
        return super.introduce()+" I am a Teacher." +temString;
    }
    public String introduceWith(Student student) {
        String temString = " I don't teach "+student.getName()+".";
        if(this.equal(student.getKlass())){
            temString = " I teach "+student.getName()+".";
        }
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher."+temString+"";
    }
    public boolean equal (Klass klass){
        if(getKlass().getNumber() == klass.getNumber()){
            return true;
        } else {
            return false;
        }
    }
}


