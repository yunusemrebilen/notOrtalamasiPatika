import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		int matematik,fizik,kimya,turkce,tarih,muzik,toplam ;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Matematik notunuzu giriniz :  ");
		matematik =input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz :  ");
		fizik =input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz :  ");
		kimya =input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz :  ");
		turkce =input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz :  ");
		tarih =input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz :  ");
		muzik =input.nextInt();
		
		double ortalama;
		toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		ortalama = (toplam / 6.0) ;
		System.out.println(ortalama);
		
		String str = ortalama > 60 ? "Geçtiniz" : "Kaldınız" ;
		System.out.println(str);
		

	}

}
