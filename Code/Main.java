import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
	ArrayList<Student> stdnts;
	ArrayList<Subject> sbjcts;
	
	public static void main(String [] args) {
		
	}
	
	//file1 = Students file
	//file2 = Subjects file 
	//fiel3 = Academic plan
	public void ReadFiel(String file1, String file2, String file3, String fiel4) {

	        String line = "";

	        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] sp = line.split(",");
	                Student st = new Student(sp[0],Integer.parseInt(sp[1]));
	                stdnts.add(st);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        

	        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] sp = line.split(",");
	                Subject sb = new Subject(Integer.parseInt(sp[2]), sp[1]);
	                for(Student st: stdnts) {
	                	if(st.getEstID().equals(sp[0])) {
	                		st.getSubjts().add(sb);
	                	}
	                }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(file3))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] sp = line.split(",");
	                
	                if(!sp[5].equals("00000")) {
	                	ClassRoom cr = new ClassRoom(Integer.parseInt(sp[5]));
	                	Subject sb = new Subject(Integer.parseInt(sp[5]),sp[0],cr, sp[3], sp[4]);
	                	sbjcts.add(sb);
	                }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	}
}
