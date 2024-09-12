import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductListDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductList product = new ProductList();
        DecimalFormat dfm = new DecimalFormat("#,###.00");

        System.out.print("How many list of product to add in stock : ");
        int add = sc.nextInt();
        int[] list = new int[add];
        
        System.out.println();
        for(int i = 0; i<list.length;i++) {
            System.out.print("Input product ID : ");
            product.setId(sc.next());

            System.out.print("Input product Price : ");
            product.setPrice(sc.nextFloat());
            System.out.print("Input product Unit : ");

            product.setUnit(sc.nextInt());
            System.out.println();
        }

	}

}
