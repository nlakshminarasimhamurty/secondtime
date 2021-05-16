import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		
		Map<String, String> names = new HashMap<String, String>();
		
		names.put("name"+"", "Naveen");
		
		System.out.println(names.size());
		
		System.out.println(names.get("name"));
		
		for(int i =0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
	}

}
