import java.util.*;
public class Building {
	String name;
	HashMap<String,Floor> floors;
	private static Building buildingObj= null;
	private Building(String name){
		this.name = name;
		floors = new HashMap<>();
		System.out.println("Added building "+name);
	}
	public static synchronized Building obj(String name) {
		if(buildingObj == null) {
			buildingObj = new Building(name);
			return buildingObj;
		}else
			return buildingObj;
	}
	void add_floor(String floorName) {
		this.floors.put(floorName,new Floor(floorName));
	}
	
	void addConfRoom(String floorName,String confname) {
		Floor f = this.floors.get(floorName);
		f.add_confRoom(confname);
	}
	
	void book(String floorName, float start, float end) {
		Floor f = this.floors.get(floorName);
		f.add_meeting(start, end);
	}
	
	void cancelBooking(int start, int end, String floor, String room) {
		
		if(this.floors.containsKey(floor)) {
			Floor f = this.floors.get(floor);
			f.cancelBooking(start,end,room);
		}else {
			System.out.println("Wrong Floor");
		}
	}
	public void listBookings(String floor) {
		// TODO Auto-generated method stub
		if(Util.checkFloor(this.floors,floor)) {
			Floor f = this.floors.get(floor);
			Iterator<ConfRoom> i = f.confroom.values().iterator();
			while(i.hasNext()) {
				ConfRoom c = i.next();
				System.out.println(c.meetings+" "+floor+" "+c.name);
			}
		}
	}
	public void search(int start, int end, String floor) {
		// TODO Auto-generated method stub
		if(Util.checkFloor(this.floors,floor)) {
			this.floors.get(floor).search(start,end);
		}
	}
}
