package question5;

public class Translation {

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
		String[] two_digit = new String[] { "", "sepuluh", "sebelas", "dua belas", "tiga belas", "empat belas", "lima belas", "enam belas", 
				"tujuh belas", "lapan belas", "sembilan belas" };
		String[] puluhan = new String[] { "", "", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh", 
				"tujuh puluh", "lapan puluh", "sembilan puluh" };
		String[] ratusan = new String[] {"ratus"};
		
		// 0-9
		if(length == 1) {
			System.out.println(one_digit[number[0] - '0']);
			return;
		}
		
		int x = 0;
		while (x < number.length) {
			
			// 100-999
			if (length == 3) {
				if (number[x] - '0' != 0) {
					System.out.print(one_digit[number[x] - '0'] + " ");
	                System.out.print(ratusan[length - 3] + " ");
				}
				--length;
			} else {
				
				//10-19
				if (number[x] - '0' == 1) {
                    int sum
                        = number[x] - '0' + number[x + 1] - '0';
                    System.out.println(two_digit[sum]);
                    return;
                } 
				// 21-99
				else {
					int i = (number[x] - '0');
                    if (i > 0)
                        System.out.print(puluhan[i]
                                         + " ");
                    else
                        System.out.print("");
                    ++x;
                    if (number[x] - '0' != 0)
                        System.out.println(
                            one_digit[number[x] - '0']);
				}
			}
			++x;
		}
	}

}
