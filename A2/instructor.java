package A2;
import java.util.*;
public class instructor implements user{
    private String name;
    private int id;
    private static int numinstructors=0;
    public instructor(String instructor_name){
        this.name=instructor_name;
        this.id=numinstructors;
        numinstructors++;
        Main.instructorlist.add(this);
    }
    public String get_name(){return this.name;}
    public int get_id(){return this.id;}
    public void add_comments(String comments1){
        comment newcomment=new comment(comments1,"INSTRUCTOR",this.name);
    }
    public void view_comments(){
        for(int i=0;i<Main.comments.size();i++){
            comment x=Main.comments.get(i);
            String comment_body=x.get_body();
            String instructor_name=x.get_person_name();
            Date date=x.get_date_time();
            System.out.println(comment_body+" - "+instructor_name+"\n"+date);
        }
    }

}