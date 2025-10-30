import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, h, m, s;
		int hora, min, seg;
		System.out.print("Digite a duracao em segundos: ");
		x = sc.nextDouble();
		h = x / 3600;
		hora = (int)h;
		m = (h - hora)*60;
		min = (int)m;
		s = (m - min) * 60;
		seg = (int)s;
		System.out.print(hora + ":" + min + ":" + seg);
		


sc.close();
	}
}
