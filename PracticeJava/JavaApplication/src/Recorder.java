
import java.util.HashMap;


public class Recorder {
	
	HashMap<String,String> map;
	
	public Recorder() {
		map = new HashMap<>();
		
	}
	public void put(String key, String value) {
		map.put(key, value);
		System.out.println(key + "=" + value);
	}
	
	public void get(String key) {
		if (map.containsKey(key)) {
			System.out.println(map.get(key));
		}else {
			throw new IllegalArgumentException();
	 		}
		}
	
    public void delete(String key) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("deleted: " + key);
        } else {
            throw new IllegalArgumentException();
        }
    }
	
	public void delete() {
		
		map.clear();
		System.out.println("deleted all");
		
		
	}

}
