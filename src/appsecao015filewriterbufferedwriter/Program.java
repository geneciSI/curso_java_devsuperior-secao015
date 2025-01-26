package appsecao015filewriterbufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon","Good night"};
		String path = "D:\\ws-eclipse\\secao015arquivos\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
                bw.write(line);
                bw.newLine(); //quebra de linha
            }
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
