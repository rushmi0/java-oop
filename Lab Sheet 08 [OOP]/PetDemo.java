import java.util.Scanner;

public class PetDemo {

	public static void main(String[] args) {

		Pet pet = new Pet();
		Scanner sc = new Scanner(System.in);

		System.out.print("Input pet name  : ");
		String name = sc.nextLine();
		System.out.print("Input pet gender  : ");
		char gender = sc.next().charAt(0);
		System.out.print("Input birth year  : ");
		int birthyear = sc.nextInt();
		System.out.println();

		pet.setName(name); // ส่งค่าไปให้ setName()
		pet.setBirthyear(birthyear); // ส่งค่าไปให้ setBirthyear()
		pet.setGender(gender);// ส่งค่าไปให้ setGender()
		
		System.out.print(pet); // แสดงผลการคำนวณทั้งหมด

	}

}
