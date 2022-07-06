import java.util.Scanner;
public class Main  {
    public static void main(String [] args){
    	int year;
    	Scanner input = new Scanner(System.in);
    	System.out.print("DoğumYılınızı Giriniz: ");
    	year = input.nextInt();
    	
    	switch (year %12) {
    		case 0:
    			System.out.println("Çin Zodyağı Burcunuz: " + "Monkey" );
    			break;
    		case 1:
    		    System.out.println("Çin Zodyağı Burcunuz: " + "Rooster");
    		     break;
    	    case 2:
    			System.out.println("Çin Zodyağı Burcunuz: " + "Dog");
    			break;
    	     case 3:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Pig");
    			break;
    		case 4:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Rat");
    			break;
             case 5:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Ox");
    			break;    		
    	    case 6:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Tiger");
    			break;
    		case 7:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Rabbit");
    			break;
        	case 8:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Dragon");
    			break;
    		case 9:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Snake");
    			break;
    		case 10:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Horse");
    			break;
    		case 11:
    			System.out.println("Çin Zodyağı Burcunuz: " +"Sheep");
    			break;
    			default:
    				System.out.println("Hatalı giriş yapıldı !");
    	}
    }
   }

