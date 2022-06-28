import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int day, month;
		String zodiac = "";
		Scanner deger = new Scanner(System.in);
		System.out.println("dogdugunuz ayi giriniz: ");
		month = deger.nextInt();
		System.out.println("dogdugunuz gunu giriniz: ");
		day = deger.nextInt();
		if (month == 3 && day >= 21 || month == 4 && day <= 20) {
			zodiac = "koc";
		}
		if (month == 4 && day >= 21 || month == 5 && day <= 21) {
			zodiac = "boga";
		}
		if (month == 5 && day >= 22 || month == 6 && day <= 22) {
			zodiac = "ikizler";
		}
		if (month == 6 && day >= 23 || month == 7 && day <= 22) {
			zodiac = "yengec";
		}
		if (month == 7 && day >= 23 || month == 8 && day <= 22) {
			zodiac = "aslan";
		}
		if (month == 8 && day >= 23 || month == 9 && day <= 22) {
			zodiac = "basak";
		}
		if (month == 9 && day >= 23 || month == 10 && day <= 22) {
			zodiac = "terazi";
		}
		if (month == 10 && day >= 23 || month == 11 && day <= 21) {
			zodiac = "akrep";
		}
		if (month == 11 && day >= 22 || month == 12 && day <= 21) {
			zodiac = "yay";
		}
		if (month == 12 && day >= 22 || month == 1 && day <= 21) {
			zodiac = "oglak";
		}
		if (month == 1 && day >= 22 || month == 2 && day <= 19) {
			zodiac = "kova";
		}
		if (month == 2 && day >= 20 || month == 3 && day <= 20) {
			zodiac = "balik";
		}
		System.out.println("burcunuz: "+zodiac);
	}

}
