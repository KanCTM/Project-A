package HW1;


import java.util.Scanner;

public class baiTap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
         
        System.out.println("Nhập vào số thứ nhất: ");
        int a  = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        int c = scanner.nextInt();
       
     
     // Check độ dài tam giác để xem tam giác đó là gì (tam giác vuông)
        if ((a>b+c) || (b>a+c) || (c>a+b) || a<0 || b <0 || c<0)  {
			System.out.println("Đây không phải là tam giác");
			
        } else if (a==b && b==c) {
			System.out.println("Đây là tam giác đều");
			
		} else if  (a==b || b==c || c==a ) {
			System.out.println("Đây là tam giác cân");
			
		} else if  ((a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==a*a+b*b)  ) {	
			System.out.println("Đây là tam giác vuông");
			
		}else if  ((a*a==b*b+c*c)&& (c== b) || (b*b==a*a+c*c)&& (c==a) || (c*c==a*a+b*b)&& (a==b)  ) {	
			System.out.println("Đây là tam giác vuông cân");
			
		} else {
			System.out.println("Đây là tam giác thường");
		}
	}

}
