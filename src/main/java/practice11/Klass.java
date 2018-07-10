package practice11;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> members  = new ArrayList<>();
    private ArrayList<JoinClassListener> joinClassListenerList = new ArrayList<>();
    private ArrayList<AssignLeaderListener> assignLeaderListenerList = new ArrayList<>();


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
        if(student.getKlass()!=null&&getNumber()==student.getKlass().getNumber()){
            leader = student;
            emitAssignLeaderListener(student);
        } else {
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember(Student student){
            getMembers().add(student);
            student.setKlass(this);
            emitJoinClassListener(student);
    }
    public void registerAssignLeaderListener(AssignLeaderListener assignLeaderListener){
        assignLeaderListenerList.add(assignLeaderListener);
    }
    public void registerJoinClassListner(JoinClassListener joinClassListener){
        joinClassListenerList.add(joinClassListener);
    }
    public void emitAssignLeaderListener(Student student){
        for(AssignLeaderListener i:assignLeaderListenerList ){
            i.sayAssignLeader(student,this.number);
        }
    }
    public void emitJoinClassListener(Student student){
        for(JoinClassListener i:joinClassListenerList ){
            i.saySomeOneJoinClass(student,this.number);
        }
    }
}

