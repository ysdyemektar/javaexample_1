import java.util.Scanner;
   public class Ortalama { 
          public static void main ( String [] args ) {
          	
          	int mat, fizik, turkce, kimya, muzik;
          	
          	Scanner input = new Scanner( System.in);
   
       	
          	System.out.print(" Matematik notunuz : " );
          	mat = input. nextInt();
          	
          	
          	       	
          	System.out.print(" Türkçe notunuz : " );
          	turkce = input. nextInt();
          	
          	       	
          	System.out.print(" Fizik notunuz : " );
          	fizik = input. nextInt();
          	
          	       	
          	System.out.print(" Kimya notunuz : " );
          	kimya = input. nextInt();
          	
          	       	
          	System.out.print(" Müzik notunuz : " );
          	muzik = input. nextInt();
          	
         // 	if ( 0 > mat, turkce, fizik, muzik, kimya < 100) {
          		
          	double avarage =( mat + fizik + turkce + kimya + muzik ) / 5;
       //  	}
            //else {
           // 	System.out.println("Girilen değerler 0 ile 100 arasında değildir.");
       //  }
         
         System.out.println("--------------------") ;     
             	
          	if (avarage <= 55){
         System.out.println( "Sınıfta kaldınız :( " );
         }
         
         else  {
         	System.out.println( "Tebrikler sınıfı geçtiniz ");
         	
         }
     
         System.out.println("Ortalamanız :" + avarage );
         
         }
       }
          	
          
          
     