import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
	
	ArrayList<Student> stdnts = new ArrayList<>();
	
	public static void main(String [] args) {
		Main mn = new Main();
		mn.ReadFile(args[0],args[1],args[2],args[3]);
	}
	
	//file1 = Students file
	//file2 = Subjects file 
	//file3 = Academic plan
	public void ReadFile(String file1, String file2, String file3, String file4) {

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

	                	if(sp.length == 7) {
	        				ClassRoom cr = new ClassRoom(sp[6]);

	                		for(Student st: stdnts) {
		                		for(Subject sb: st.getSubjts()) {
		                			if(sb.getSubId().equals(sp[0])) {
		                				String [] sr = sp[4].split(":");
		                				String [] s = sp[5].split(":");
		                				sb.setST(Integer.parseInt(sr[0]+sr[1]));
		                				sb.setFT(Integer.parseInt(s[0]+s[1]));
		                				sb.setUsed(true);
		                				sb.setClassRoom(cr);
		                				sb.setGN(Integer.parseInt(sp[2]));
		                			}
		                		}
		                	}
	                	}
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(file4))) {

	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] sp = line.split(",");	                
	                
	                for(Student st: stdnts) {
	                	if(st.getSubjts().size()>=1) {
	                		for(Subject sb : st.getSubjts()) {
	                			if(sb.getClassRoom().getID().equals(sp[0])) {
	                				sb.getClassRoom().setType(sp[1]);
	                				sb.getClassRoom().setSeats(Integer.parseInt(sp[2]));
	                				sb.getClassRoom().setAccess(Integer.parseInt(sp[3]));
	                			}
	                		}
	                	}
	                }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }  
	
	}
}
