import java.util.Scanner;

public class MultiLineExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder lines = new StringBuilder();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if("".equals(line.trim())) { 
				break;
			}else {
				lines.append(line+"\n");
			}
		}
		System.out.println(lines);
		sc.close();
	}
}
