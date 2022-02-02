package Lab3;

import java.util.Scanner;
import java.util.Random;

public class Lab3rand {
	public static void main(String[] args){
		
		Random rand = new Random(); // ใช้ rand เป็นการเรียกใช้คำสั่งแทน 
		Scanner scanf = new Scanner(System.in);	 // ใช้ scanf เป็นการเรียกใช้คำสั่งแทน
		int n ;
		int r = 0 ;
		
		System.out.print("Please enter your random value :");
		n = scanf.nextInt(); //รับค่า n มา
		System.out.println("-----------------------");
		
		int[] Array = new int[n];// สร้าง Array เท่ากับขนาดของ n
		for(int i = 0 ; i <= n ; i ++) {
			
			Array[r] = rand.nextInt(100); // เก็บค่า r ที่ random แล้วไปเก็บไว้ใน Array
			
			System.out.print("Array["+i+"]");
			System.out.println(" = " + Array[r]);
		}
		
		
		
	}
}