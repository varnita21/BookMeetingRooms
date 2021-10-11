
public class Operations {
	Building building;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op =new Operations();
		
		op.addBuilding("flipkart1");
		op.addFloor("FirstFloor");
		op.addConfRoom("FirstFloor","c1");
		op.addConfRoom("FirstFloor","c2");
		op.book(11,13,"flipkart1","FirstFloor");
		op.book(13,14,"flipkart1","FirstFloor");
		op.book(3,4,"flipkart1","FirstFloor");
		op.book(4,6,"flipkart1","FirstFloor");
		op.book(3,5,"flipkart1","FirstFloor");
		
		op.cancel(11,13,"flipkart1","FirstFloor","c1");
		
		op.book(11,13,"flipkart1","FirstFloor");
		op.listBookings("flipkart1","FirstFloor");
		op.search(2,3,"flipkart1","FirstFloor");
	}

	private void search(int start, int end, String building, String floor) {
		// TODO Auto-generated method stub
		Building b1 = Building.obj(building);
		b1.search(start,end,floor);
	}

	private void listBookings(String building, String floor) {
		// TODO Auto-generated method stub
		Building b1 = Building.obj(building);
		b1.listBookings(floor);
	}

	private void cancel(int start, int end, String building, String floor, String room) {
		// TODO Auto-generated method stub
		this.building.cancelBooking(start,end,floor,room);
	}

	private void book(int i, int j, String string, String floor) {
		// TODO Auto-generated method stub
		building.book(floor, i, j);
	}

	private void addConfRoom(String floorName,String confroom) {
		// TODO Auto-generated method stub
		building.addConfRoom(floorName,confroom);
	}

	private void addFloor(String string) {
		// TODO Auto-generated method stub
		this.building.add_floor(string);
	}

	private void addBuilding(String buildingName) {
		// TODO Auto-generated method stub
		building = Building.obj(buildingName);
	}

}
