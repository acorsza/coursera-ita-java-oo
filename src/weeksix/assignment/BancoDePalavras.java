package weeksix.assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
	
	private static String palavraSelecionada;
	private static List<String> palavras = new ArrayList<String>();

	public static String obterPalavra() {
		String line;
		if (palavras.isEmpty()) {
			try (InputStream fis = new FileInputStream(
					"/Users/aderleifilho/Developer/Coursera/ITAJavaOO/src/weeksix/assignment/palavras.txt");
					InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
					BufferedReader br = new BufferedReader(isr);) {
				while ((line = br.readLine()) != null) {

					palavras.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		int index = new Random().nextInt(palavras.size());

		palavraSelecionada = palavras.get(index);
		palavras.remove(index);
		return palavraSelecionada;
	}
}
