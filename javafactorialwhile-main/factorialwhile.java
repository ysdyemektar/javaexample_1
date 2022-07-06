import java.util.Scanner;
public class Main{
  public static void main(String [] args){
  	 Scanner input = new Scanner(System.in);
  	 System.out.print("Faktoriyeli hesaplanacak sayı giriniz:");
  	 int n = input.nextInt();
  	 int total=1;
  	 int i=1;
  	 while(i<=n ){
  	
  	 	total *=i;
  	 	i++;
  	 }
  	 System.out.println(n+".faktoriyeli:" + total);
  	}
  }
  	 
  