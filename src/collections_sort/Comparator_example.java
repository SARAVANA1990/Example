package collections_sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.ArrayList;

public class Comparator_example {
	
	public static void main(String a[])
	{
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName());
			System.out.println(developer.getAge());
			System.out.println(developer.getSalary());
		}

		//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName());
			System.out.println(developer.getAge());
			System.out.println(developer.getSalary());
		}

	}
	
	
	public static List<Developer> getDevelopers(){
		
		List<Developer> result = new ArrayList<Developer>();
		
		Developer dev=new Developer();
		dev.setName("aaa");
		dev.setAge(12);
		dev.setSalary(3232323.00);
		result.add(dev);
		
		Developer dev1=new Developer();
		dev1.setName("bbb");
		dev1.setAge(10);
		dev1.setSalary(1212121.00);
		result.add(dev1);
	
		Developer dev2=new Developer();
		dev2.setName("ccc");
		dev2.setAge(7);
		dev2.setSalary(114444.00);
		result.add(dev2);
	
		return result;
		
	}
	
}
