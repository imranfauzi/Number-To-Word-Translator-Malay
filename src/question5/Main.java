package question5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Masukkan no:");
		 translate_to_words("9".toCharArray());

	}
	
	
	static void translate_to_words(char[] number) {
		
		int length = number.length;
		
		if(length == 0) {
			System.out.println("Tiada Input");
			return;
		}
		if(length > 3) {
			System.out.println("Input melebihi limit");
			return;
		}
		
		
		String[] one_digit = new String[] { "kosong", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "lapan", "sembilan" };
		String[] dua_digit = new String[] { "", "sepuluh", "sebelas", "dua belas", "tiga belas", "empat belas", "lima belas", "enam belas", 
				"tujuh belas", "lapan belas", "sembilan belas" };
		String[] puluhan = new String[] { "", "", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh", 
				"tujuh puluh", "lapan puluh", "sembilan puluh" };
		String[] ratusan = new String[] {"ratus"};
		
		if(length == 1) {
			System.out.println(one_digit[number[0] - '0']);
			return;
		}
		
		int x = 0;
	}

}
