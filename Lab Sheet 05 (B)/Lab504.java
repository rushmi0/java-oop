import java.util.Scanner;

public class Lab504 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = sc.next();
		sc.nextLine();
		
		// .contains() = ต้องประกอบด้วย
		while (!name.contains(" ") || name.lastIndexOf(" ") != name.indexOf(" ") || name.startsWith(" ")|| name.endsWith(" ")) {
				
			System.out.print("Input name, again : ");
			name = sc.next();
			sc.nextLine();
			
		}

		System.out.println();
		int spase = name.indexOf(" ");
		String f_name = name.substring(0, spase); // แบ่งข้อความตั้งแต่ตำแแหน่งที่ 0 จนไปถึง spasebar (spasebar เก็บเป็น spasebar)												  
		String l_name = name.substring(spase + 1);// ถัดจาก spase(spasebar) มาหนึ่งตำแหน่งคือเอาหมด game {haha}
		System.out.print("Show name is format = " + l_name.toLowerCase().charAt(0) + "." + f_name.toLowerCase());

	}

}
