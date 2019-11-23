
public class ClassRoom {
	
	private int ID;
	private String type;
	private int seats;
	private int access;
	
	public ClassRoom(int ID) {
		this.ID = ID;
	}
	
	public ClassRoom(String type, int seats, int access) {
		this.access=access;
		this.seats=seats;
		this.type= type;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setType(String type) {
	   this.type = type;
	}
	
	public void setSeats(int seats) {
	   this.seats = seats;
	}
	
	public void setGrpNum(int access) {
	   this.access = access;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getType() {
	   return type;
	}
	
	public int getSeats() {
	   return seats;
	}
	
	public int getGrpNum() {
	   return access;
	}
}

