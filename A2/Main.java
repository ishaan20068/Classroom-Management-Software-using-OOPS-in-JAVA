package A2;
import java.util.*;
public class Main{
    public static ArrayList<comment> comments=new ArrayList<>();
    public static ArrayList<student> studentlist=new ArrayList<>();
    public static ArrayList<instructor> instructorlist=new ArrayList<>();
    public static void main(String[] args) {
        int choicetemp =0;
        while(choicetemp>0){
            Scanner sc=new Scanner(System.in);
            Scanner scs=new Scanner(System.in);
            student s0=new student("S0");
            student s1=new student("S1");
            student s2=new student("S2");
            instructor i0=new instructor("I0");
            instructor i1=new instructor("I1");
            System.out.println("Welcome to Backpack\n1. Enter as instructor\n2. Enter as student\n3. Exit");
            System.out.print("enter your choice: ");
            int choice=sc.nextInt();
            if(choice==3){return;}
            else if(choice==1){
                System.out.println("Instructors:\n");
                for(int i=0;i<instructorlist.size();i++){
                    System.out.println(i+" - "+instructorlist.get(i).get_name());
                }
                System.out.print("Choose id: ");
                int id_instructor=sc.nextInt();
                instructor prof=instructorlist.get(id_instructor);
                int choice1=0;
                while(choice1!=9){
                    System.out.println("Welcome "+prof.get_name());
                    System.out.println("INSTRUCTOR MENU\n1. Add class material\n2. Add assessments\n3. View lecture materials\n4. View assessments\n5. Grade assessments6\n. Close assessment\n7. View comments\n8. Add comments\n9. Logout");
                    System.out.print("your choice: ");
                    choice1=sc.nextInt();
                    if(choice1==1){

                    }
                    else if(choice1==2){

                    }
                    else if(choice1==3){
                        
                    }
                    else if(choice1==4){
                        
                    }
                    else if(choice1==5){
                        
                    }
                    else if(choice1==6){
                        
                    }
                    else if(choice1==7){
                      prof.view_comments();  
                    }
                    else if(choice1==8){
                        System.out.print("enter the comment: ");
                        String comment1=scs.nextLine();
                        prof.add_comments(comment1);
                        System.out.println("your comment was added!");
                    }
                    else if(choice1==9){
                        break;
                    }
                    else{System.out.println("invalid choice!!!\nChoose again!!!");choice1=0;}
                }
            }
            else if(choice==2){
                System.out.println("Students:\n");
                for(int i=0;i<studentlist.size();i++){
                    System.out.println(i+" - "+studentlist.get(i).get_name());
                }
                System.out.print("Choose id: ");
                int id_student=sc.nextInt();
                student child=studentlist.get(id_student);
                int choice1=0;
                while(choice1!=9){
                    System.out.println("Welcome "+child.get_name());
                    System.out.println("STUDENT MENU\n1. View lecture materials\n2. View assessments\n3. Submit assessment\n4. View grades\n5. View comments\n6. Add comments\n7. Logout");
                    System.out.print("your choice: ");
                    choice1=sc.nextInt();
                    if(choice1==1){

                    }
                    else if(choice1==2){

                    }
                    else if(choice1==3){
                        
                    }
                    else if(choice1==4){
                        
                    }
                    else if(choice1==5){
                        child.view_comments();
                    }
                    else if(choice1==6){
                        System.out.print("enter the comment: ");
                        String comment1=scs.nextLine();
                        child.add_comments(comment1);
                        System.out.println("your comment was added!");
                    }
                    else if(choice1==7){
                        break;
                    }
                    else{System.out.println("invalid choice!!!\nChoose again!!!");choice1=0;}
                }
            }
            else{System.out.println("Invalid choice!!!\nChoose again!!!");choice=0;}
        }
    }
}
