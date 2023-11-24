package DemoProject;

// Count the number of names starting with alphabet A in list

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ananda");
		names.add("Ram");
		names.add("Shyam");
		names.add("Hari");
		names.add("Krishna");
		
		int count = 0;
		
		for (int i = 0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count ++;
				
			}
		}
		
		System.out.println(count);
		
	}
	
	@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ananda");
		names.add("Ram");
		names.add("Shyam");
		names.add("Hari");
		names.add("Krishna");
		names.add("Sita");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d = Stream.of("Ananda", "Ram", "Shyam", "Hari", "Krishna", "Sita").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		

	}
	

}
