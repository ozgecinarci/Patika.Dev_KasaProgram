import java.util.Scanner;
public class kasaprogram {
	public static void main (String[] args){
	    double Armut= 2.14;
	    double Elma= 3.67;
	    double Domates= 1.11;
	    double Muz= 0.95;
	    double Patlican=5.00;
	    
	    Scanner scan= new Scanner(System.in);
	    System.out.println("Armut kaç kilo? : ");
	    double kiloA= scan.nextDouble();
	    System.out.println("Elma kaç kilo? : ");
	    double kiloE= scan.nextDouble();
	    System.out.println("Domates kaç kilo? :");
	    double kiloD= scan.nextDouble();
	    System.out.println("Muz kaç kilo? :");
	    double kiloM= scan.nextDouble();
	    System.out.println("Patlýcan kaç kilo? : ");
	    double kiloP= scan.nextDouble();
	    float toplam= (float)((kiloA*Armut) + (kiloE*Elma) + (kiloD*Domates) + (kiloM*Muz)+(kiloP*Patlican)) ;
	    System.out.println("Toplam tutar: "+toplam + ("TL"));
	    
	    
	
	}

}
