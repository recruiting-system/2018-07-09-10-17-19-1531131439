package practice09;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> members  = new ArrayList<>();

    public ArrayList getMembers() {
        return members;
    }

    public void setMembers(ArrayList members) {
        this.members = members;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        if(this == student.getKlass()){
            leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember(Student student){
        if(getMembers().size()== 0 || !getMembers().contains(student)){
            getMembers().add(student);
        }
    }
}

