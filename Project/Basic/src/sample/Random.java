package sample;
import java.lang.Math;
public class Random 
{
	public static void main(String[] args) 
	{
		int min = 1000;  
		int max = 9999;        
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);  
	}
}
