
public class Subject {
	
	private String Sub_ID;
	private int Grup_Number;
	private ClassRoom Class_room;
	private String Start_time;
	private String Finish_time;
	
	public Subject(int gn,String ID ) {
		this.Sub_ID  = ID;
		this.Grup_Number = gn;
	}
	
	public Subject(int gn, String ID, ClassRoom cr, String St, String Ft ) {
		this.Grup_Number = gn;
		this.Sub_ID = ID;
		this.Class_room = cr;
		this.Start_time = St;
		this.Finish_time = Ft;
	}
}
