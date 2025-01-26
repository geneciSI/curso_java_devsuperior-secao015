package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

			File file = new File("D:\\ws-eclipse\\secao015arquivos\\in.txt");
			Scanner sc = null;
			try {
					sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			finally {
				if (sc != null) {
					sc.close();
				}
			}
			
	}

}
