package ch09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 class Student {
	private String name;
	private int score;

	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return name + ":" + score;
	}
 }
	
	
	class StudentManager{
		private Map<String,Student> studentMap = new HashMap<>();
		
		public void addStudnet(String name,int score) {
			if(studentMap.containsKey(name)) {
				System.out.println("이미 등록된 이름입니다. "+ name);
				return;
			}
			
			studentMap.put(name, new Student(name,score));
		}
		
		
		public void printSortedStudents() {
			List<Student> studnetList = new ArrayList<>(studentMap.values());
			studnetList.sort((a,b) -> b.getScore() - a.getScore()); //제네릭에서 한것처럼 내림차순 처리된다. 
			System.out.println("성적 내림차순 정렬 결과 -> ");
			for(Student s : studnetList) {
				System.out.println(s);
			}
			
		}
		public void serachStudent(String name) {
			Student s = studentMap.get(name);
			if( s != null) {
				System.out.println("학생"+name+"의 성적은 ? "+s.getScore()+"입니다.");
			}else {
				System.out.println("입력된 학생은 존재하지 않는 학생입니다.");
			}
		}
		
		public void printAverageScore() {
			if(studentMap.isEmpty()) {
				System.out.println("등록된 학생이 없습니다. 학생 정보를 입력해주세요.");
				return;
			}
			
			int total = 0;
			for(Student s:studentMap.values()) {
				total = total + s.getScore();
			}
			double avg = (double)total / studentMap.size();
			System.out.printf("전체 학생의 평균 성적은? %f입니다."+avg);
			}
		}
	
	public class Main{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			StudentManager manager = new StudentManager();
			
			System.out.println("등록할 학생의 수 입력하세요 >");
			int n = Integer.parseInt(sc.nextLine()); 
//			parseInt에서는 nextInt메서드 사용 불가 
			
			for(int i=0; i<n; i++) {
				System.out.printf("학생 %d , 이름: ",i +1);
				String name =sc.next();
				System.out.printf("학생 %d 성적 :",i+1);
				int score = Integer.parseInt(sc.nextLine());
				
				manager.addStudnet(name, score);
			}
				System.out.println();
				manager.printSortedStudents();
				System.out.println();
				System.out.print("성적을	조회할	학생	이름을	입력하세요:	");
				String	searchName	=sc.nextLine();
				manager.serachStudent(searchName);System.out.println();
				manager.printAverageScore();
				sc.close();
			} 
		}
 