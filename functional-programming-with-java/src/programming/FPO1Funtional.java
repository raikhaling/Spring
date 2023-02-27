package programming;

import java.util.List;

public class FPO1Funtional {
 
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 1, 2, 8);
		List<String> courses = List.of("spring", "spring boot", "API", "micoservices", "AWS", "Azure");
//		System.out.println("Odds numbers :");
//		printOddNumbersInListFuntional(numbers);
//		System.out.println("All the availabe courses:");
//		printCourses(courses);
//		System.out.println("Courses containing Spring:");
//		printSpring(courses);
//		System.out.println("Courses having letters more than 4:");
//		printAtLeastFourLetters(courses);
	//	printEvenNumbersInListFuntional(numbers);
	//	printOddNumbersInListFuntional(numbers);
		charAtCourses(courses);
		
		

	}

//	private static void print(int number) {
//		System.out.println(number);
//	}
	private static void print(int number) {
		if(number % 2==0)
			System.out.println(number);
	}
	private static boolean isOdd(int number) {
		return number %2 != 0; //number %2 == 1
	}

	private static void printAllNumbersInListFuntional(List<Integer> numbers) {
		// [1,2,3...]
		// first convert into stream
		
		//what to do
		numbers.stream().forEach(System.out::println); //method reference


	}
	private static void printEvenNumbersInListFuntional(List<Integer> numbers) {
		// [1,2,3...]
		// first convert into stream
		
		//what to do
		numbers.stream()
			.filter(number -> number%2==0)//Filter - only allows even number//lamda exp 
			.map(number -> number*number)
				.forEach(System.out::println); //method reference


	}
	private static void printOddNumbersInListFuntional(List<Integer> numbers) {
		// [1,2,3...]
		// first convert into stream
		
		//what to do
		numbers.stream()
			.filter(number -> number%2!=0)//Filter - only allows even number//lamda exp 
			.map(number -> number*number*number)
				.forEach(System.out::println); //method reference

		

	}
	
	public static void printCourses(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);
	}
	public static void printSpring(List<String> courses) {
		courses.stream()	
		 .filter(course->course.contains("spring"))
		 	.forEach(System.out::println);
	}
	public static void printAtLeastFourLetters(List<String> courses) {
		courses.stream()
			.filter(course->course.length()>=4)
				.forEach(System.out::println);
	}
	public static void charAtCourses(List<String> courses) {
		courses.stream()
			.map(course -> course +" " +course.length())
			.forEach(System.out::println);	
			
	}

}
