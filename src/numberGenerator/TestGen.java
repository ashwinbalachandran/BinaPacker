package numberGenerator;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class TestGen {

	public static void main(String[] args) {
		GenerateNumbers g = new GenerateNumbers(100);
		try {

			g.generate(100);
			g.addToFile("test_100.txt");
			g = new GenerateNumbers(250);
			g.generate(250);
			g.addToFile("test_250.txt");
			g = new GenerateNumbers(500);
			g.generate(500);
			g.addToFile("test_500.txt");
			g = new GenerateNumbers(1000);
			g.generate(1000);
			g.addToFile("test_1000.txt");
			g = new GenerateNumbers(2500);
			g.generate(2500);
			g.addToFile("test_2500.txt");
			g = new GenerateNumbers(5000);
			g.generate(5000);
			g.addToFile("test_5000.txt");
			g = new GenerateNumbers(10000);
			g.generate(10000);
			g.addToFile("test_10000.txt");
			g = new GenerateNumbers(25000);
			g.generate(25000);
			g.addToFile("test_25000.txt");
			g = new GenerateNumbers(50000);
			g.generate(50000);
			g.addToFile("test_50000.txt");
			g = new GenerateNumbers(100000);
			g.generate(100000);
			g.addToFile("test_100000.txt");

			g = new GenerateNumbers(250000);
			g.generate(250000);
			g.addToFile("test_250000.txt");
			g = new GenerateNumbers(500000);
			g.generate(500000);
			g.addToFile("test_500000.txt");
			g = new GenerateNumbers(1000000);
			g.generate(1000000);
			g.addToFile("test_1000000.txt");

			//throw new Exception();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
