package Madhura;
import java.util.Scanner;
public class Fahrenheit_to_centigrade {
          public static void main(String[] args) {
        	  Scanner sc = new Scanner(System.in);
        	  
        	  System.out.println("Enter temperature in Fahrenheit:");
        	  double Fahrenheit = sc. nextDouble();
        	  
        	  double centigrade = (Fahrenheit - 32) * 5 / 9;
        	  
        	  System.out.println("Temperature in Centigrade:" + centigrade);
        	  
        	  
          }
}                         