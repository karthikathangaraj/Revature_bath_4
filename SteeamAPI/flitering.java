package SteeamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class flitering {

	public static void main(String[] args) {
		List<Employee> e1= Arrays.asList(				
				new Employee("Alice", "gmail", 60000),
				new Employee("Bob", "yahoo", 75000),
	            new Employee("Charlie", "hotmail", 50000),
	            new Employee("David", "revature", 80000),
	            new Employee("Eve", "Gogole", 45000));
		//e1.add(new Employee("a","e@g",123));
		
		List<String> res=e1.stream()
				         .filter(e ->e.getPhone()>45000)
				         .sorted(Comparator.comparing(Employee::getName))
						 .map(Employee::getEmail)
						 .map(String::toLowerCase)
						 .collect(Collectors.toList());
System.out.println(res);
	}

}
