package HW1;

import java.util.Scanner;

public class baiTap5 {

	public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập năm: ");
        int a = scanner.nextInt();
      
        
         // Check năm nhuận hay không
//        if (a % 4 == 0 || a % 400 == 0 ) { 
//        	System.out.printf("%d là năm nhuận.", a);
//        } else if (a % 4 == 0 && a % 400 != 0 )  {
//        	System.out.printf("%d không phải là năm nhuận.", a);
//        } else {
//        	System.out.printf("%d không phải là năm nhuận.", a);
//        }
	
	     // check theo boolean
        
        boolean check;
        if ((a % 4 == 0 && a % 100 !=0 ) || a%400 ==0) {
        	check = true;
        } else {
        	check = false;
        }
        
        if (check) {
        	System.out.printf ("%d là năm nhuận" , a);
        } else {
        	System.out.printf ("%d là năm không nhuận" ,a);
        }
        
        scanner.close();
        
	}	
}


  

