package lesson8;

import java.util.Scanner; 
class Main { 
    public static void main(String[] args) { 
    	//RuntimeException ex = new RuntimeException("wrong string lenght. must be at least 10 symbols");
 @SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);        
         
           String a = sc.nextLine();     
           if (a.length() <= 10) throw new IllegalArgumentException("jksdfkjbsdfksrger"); 
           System.out.println(a.toString());
    }
}
//void check (int idx){
//	if ():
//		
//		throw ������ �� ��������
//}