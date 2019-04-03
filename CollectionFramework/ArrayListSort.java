import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class ArrayListSort {
	
	public static void main(String[] args) {

List <String>fruits=new ArrayList<String>();
     

  fruits.add("Apple");
  fruits.add("Mango");
  fruits.add("Guava");
  fruits.add("Papaya");
  fruits.add("orange");
  fruits.add("Apple");



	//enhance for each loop
  
	  
	 for(String  temp:fruits){
		 
		 System.out.println(temp);}
	 
	 
	 
		 
	Iterator<String>p=fruits.iterator();
	
	while(p.hasNext()){
		String pack=p.next();
		System.out.println(pack);}
	
System.out.println("after sorting the value will be");
Collections.sort(fruits);
	
for(String temp:fruits){
	System.out.println(temp);
}
		
		
	}}		
		
