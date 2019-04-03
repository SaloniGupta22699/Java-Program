import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

		public static void main(String[] args) {
			Map<String,Integer> maps=new  TreeMap<>();
			maps.put("Rocket", 10);
			maps.put("Packer", 20);
			maps.put("Joomala", 13);
			maps.put("Opaioe", 17);
			maps.put("Nhduyd", 9);
			
			 Set<Map.Entry<String, Integer>> entries=maps.entrySet();
			 for(Map.Entry<String, Integer> temp:entries){
				 String key=temp.getKey();
				 Integer value=temp.getValue();
				 System.out.println("key - "+key);
				 System.out.println("value - "+value);
				 
			 }
			 
			
		}
}

