package A2;
import java.util.*;
public class student {
    private String name;
    private int id;
    private static int numstudents=0;
    public student(String name1){
        this.name=name1;
        this.id=numstudents;
        numstudents++;
        Main.studentlist.add(this);
    }
    public String get_name(){return this.name;}
    public int get_id(){return this.id;}
    public void add_comments(String comments1){
        comment newcomment=new comment(comments1,"STUDENT",this.name);
    }
    public void view_comments(){
        for(int i=0;i<Main.comments.size();i++){
            comment x=Main.comments.get(i);
            String comment_body=x.get_body();
            String student_name=x.get_person_name();
            Date date=x.get_date_time();
            System.out.println(comment_body+" - "+student_name+"\n"+date);
        }
    }
}
