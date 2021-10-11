import java.util.HashMap;

public class Util {

	static boolean checkFloor(HashMap<String, Floor> floors, String floorName) {
		if(floors.containsKey(floorName)) {
			return true;
		}else {
			System.out.println("Wrong floor");
			return false;
					
		}
	}
}
