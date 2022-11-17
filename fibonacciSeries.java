package com.haktanozgur.fibonacci;

import java.util.Scanner;

public class fibonacciSeries {
	// Bu metod, kullanıcıdan aldığı input parametresi ile input değeri kadar seri oluşturarak fibonacci hesaplaması yapar.
	public static void seriesFibonacci(int input) {
		int x =0;
		int y = 1;
		int z;
		for(int i = 1; i < input; i++) {
			z=x+y;
			System.out.println(x + "+ " + y + "= " + z);
			x=y;
			y=z;
		}
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz:");
		int input = scanner.nextInt();
		seriesFibonacci(input);	
	}
}
