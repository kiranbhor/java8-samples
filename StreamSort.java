import java.util.*;
import java.util.stream.Collectors;


public class StreamSort
{

 	public int price;
	String name;

	public StreamSort(int price,String name) {
		this.price = price;
		this.name = name;
	}

	public int getPrice(){
		return this.price;
	}

	public  String toString(){
		return this.price + "";
	}


	public static void main(String[] args) {
		List<StreamSort> lst = Arrays.asList(
			new StreamSort(1,"Name 1"),
			new StreamSort(3,"Name 3"),
			new StreamSort(2,"Name 2")
		);

		System.out.println(
			lst.stream().sorted((s1,s2) -> s1.getPrice() < s2.getPrice()?1:-1).collect(Collectors.toList())
		);
	}
}
