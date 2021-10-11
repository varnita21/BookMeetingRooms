import java.util.*;
public class ConfRoom {
	String name;
	TreeMap<Float,Float> meetings;
	
	ConfRoom(String name){
		this.name = name;
		this.meetings = new TreeMap<>();
		System.out.println("Added ConfRoom "+name);
	}
	
	boolean add_meeting(float start, float end) {
		
		if(search(start,end)) {
			this.meetings.put(end,start);
			System.out.println("Booked meeting "+start+":"+end);
			return true;
		}else {
			System.out.println("Slot not available");
			return false;
		}
	}

	public boolean search(float start, float end) {
		// TODO Auto-generated method stub
		Float celingKey = this.meetings.ceilingKey(start);
		if(celingKey == null || celingKey==start || this.meetings.get(celingKey) >= end) {
			return true;
		}else {
			
			return false;
		}
	}
}
