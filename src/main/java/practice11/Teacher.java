package practice11;

import java.util.LinkedList;
import java.util.Optional;

public class Teacher extends Person implements AssignLeaderListener, JoinClassListener {
    private Klass klass;
    private LinkedList<Klass> classes = new LinkedList();

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
        for( Klass i: classes) {
        i.registerAssignLeaderListener(this);
        i.registerJoinClassListner(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

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
        final String[] temClassesString = {""};
        classes.forEach(i->{
            temClassesString[0] = temClassesString[0] +", "+i.getNumber();
        });
        if(classes.size()>0){
            temString = " I teach Class "+ temClassesString[0].substring(2,temClassesString[0].length()) +".";
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
        if(getClasses().contains(klass)){
            return true;
        } else {
            return false;
        }
    }

    public boolean isTeaching(Student Student) {
        return classes!=null && classes.contains(Student.getKlass());
    }

    @Override
    public void sayAssignLeader(Student student, int number) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " become Leader of Class " + number + ".\n");
    }

    @Override
    public void saySomeOneJoinClass(Student student, int number) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " has joined Class " + number + ".\n");
    }
}


