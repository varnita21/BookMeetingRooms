import java.util.*;
import java.util.Map.Entry;
public class Floor {
	String name;
	HashMap<String,ConfRoom> confroom;
	
	Floor(String name){
		this.name = name;
		confroom = new HashMap<>();
		System.out.println("Added Floor "+name);
	}
	
	void add_confRoom(String confname) {
		this.confroom.put(confname, new ConfRoom(confname));
	}

	public void add_meeting(float start, float end) {
		// TODO Auto-generated method stub
		Iterator<ConfRoom> i = this.confroom.values().iterator();
		while(i.hasNext()) {
			ConfRoom c= i.next();
			if(c.add_meeting(start, end)) {
				return;
			}
		}
	}

	public void cancelBooking(float start, float end, String room) {
		// TODO Auto-generated method stub
		if(this.confroom.containsKey(room)) {
			ConfRoom c = this.confroom.get(room);
			c.meetings.remove(end);
			System.out.println("Removed booking from "+room);
		}else {
			System.out.println("Wrong room");
		}
	}

	public void search(int start, int end) {
		// TODO Auto-generated method stub
		for(Entry<String, ConfRoom> e: this.confroom.entrySet()) {
			if(e.getValue().search(start,end)) {
				System.out.print(e.getKey()+" ");
			}
		}
	}
}
