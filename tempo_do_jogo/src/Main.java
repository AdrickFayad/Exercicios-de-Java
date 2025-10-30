import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int inicial, _final, tempo;
		System.out.print("Hora incial: ");
		inicial = sc.nextInt();
		System.out.print("Hora incial: ");
		_final = sc.nextInt();
		
		if (inicial == _final) {
			tempo = 24;
		} else if (inicial > _final) {
			tempo = (24 -inicial ) + _final; 
		} else {
			tempo = _final - inicial;
		}
		System.out.print("O JOGO DUROU " + tempo + " HORA (S)");
		
		sc.close();
	}
}
