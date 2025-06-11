package ch10.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("alice",85),
				new Student("bob",92),
				new Student("Tom",82),
				new Student("Seul",32),
				new Student("dave",90),
				new Student("Frank",88),
				new Student("Grace",49),
				new Student("Hanna",75),
				new Student("Eve",52)
				);
		
		//성적 기준으로 그룹으로 묶어주고 
		Map<String,List<Student>> groupByGrade = students.stream()
				.collect(Collectors.groupingBy(s->{
					if(s.getScore() >= 90) return "A";
					else if(s.getScore() >=80) return "B";
					else if(s.getScore() >=70) return "C";
					else return "D";
				}));
		
		//각 그룹의 통계 ........... ? 어디서 평균 계산을 한거임 
		Map<String,IntSummaryStatistics> statsByGrade = students.stream()
				.collect(Collectors.groupingBy(s->{
					if(s.getScore() >=90) return "A";
					else if(s.getScore() >=80) return "B";
					else if(s.getScore() >=70) return "C";
					else return "D";
				},Collectors.summarizingInt(Student::getScore)));
		
		
		
		groupByGrade.forEach(
				(grade,studentList)->{System.out.println("================="); System.out.println("Grade:" +grade);
			studentList.forEach(
					student -> System.out.println("-"+student.getName() + ":" + student.getScore()));
		});
		
		System.out.println("\nStatistics by Grade : ");
		
		
		statsByGrade.forEach((grade,stats)->{
			System.out.println("Grade:"+grade);
			System.out.println(" - Count: "+stats.getCount());
			System.out.println(" - Sum: "+stats.getSum());
			System.out.println(" - Min: "+stats.getMin());
			System.out.println(" - Average: "+stats.getAverage());
			System.out.println(" - Max: "+stats.getMax());
		});
		
		
		List<String> topStudents = students.stream()
				.filter(s -> s.getScore() >= 90)
				.map(Student::getName)
				.collect(Collectors.toList());
		
		System.out.println("Top students:");
		topStudents.forEach(System.out::println);
	}
}
