import java.util.ArrayList;

public class Student {
	
   private String Student_ID;
   private ArrayList<Subject> Subjts;
   private int disability;
   
   public Student(String Student_ID, int dis) {
	   this.disability = dis;
	   this.Student_ID = Student_ID;
   }
   
   public void setStID(String Student_ID) {
	   this.Student_ID = Student_ID;
   }
   
   public void addSubjts(Subject subject) {
	   Subjts.add(subject);
   }
   
   public void setdisbility(int dis) {
	   this.disability = dis;
   }
   
   public String getEstID() {
	   return Student_ID;
   }
   
   public ArrayList<Subject> getSubjts(){
	   return Subjts;
   }
   
   public int getdisbility() {
	   return disability;
   }
}

