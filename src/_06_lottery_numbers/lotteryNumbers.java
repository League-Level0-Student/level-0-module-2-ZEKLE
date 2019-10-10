package _06_lottery_numbers;

import java.util.Random;

public class lotteryNumbers {

public static void main(String[] args) {
	Random randomNumber = new Random(); 
	int num = randomNumber.nextInt(100);
	int num2 = randomNumber.nextInt(100);
	int num3 = randomNumber.nextInt(100);
	int num4 = randomNumber.nextInt(100);
	int num5 = randomNumber.nextInt(100);
	System.out.println(num + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	
}

}
