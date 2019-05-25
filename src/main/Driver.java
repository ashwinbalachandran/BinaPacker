package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.DoubleStream;

import bestFit.BestFit;
import bestFitDecreasing.BestFitDecreasing;
import firstFit.FirstFit;
import firstFitDecreasing.FirstFitDecreasing;
import nextFit.NextFit;

public class Driver {
	static long start;
	static long end;

	public static void main(String[] args) throws IOException {
		int insize[] = { 100, 250, 500, 1000, 2500, 5000, 10000, 25000, 50000, 100000,250000,500000,1000000 };
		for (int i : insize) {
			//System.out.println("Input size = "+i);
			String f = "test_"+String.valueOf(i)+".txt";
			double wts[] = readTestFile(f);
//			runNextFit(wts);
//			runFirstFit(wts);
//			runBestFit(wts);
			runFirstFitDecreasing(wts);
//			runBestFitDecreasing(wts);
		}
	}

	private static void runBestFitDecreasing(double weights[]) {
		//System.out.println("\n BEST FIT DECREASING\n");
		BestFitDecreasing bfd = new BestFitDecreasing();
		double sum = DoubleStream.of(weights).sum();
		//System.out.println("Sum :" + sum);
		start = System.nanoTime();
		int bins = bfd.bestFit(weights, 1.0D);
		end = System.nanoTime();
		System.out.print((bins - sum)+" ");
		System.out.print((end - start) / 1000000.0);
		System.out.println("");
	}

	private static void runFirstFitDecreasing(double weights[]) {
		//System.out.println("\n FIRST FIT DECREASING\n");
		FirstFitDecreasing ffd = new FirstFitDecreasing();
		double sum = DoubleStream.of(weights).sum();
		//System.out.println("Sum :" + sum);
		start = System.nanoTime();
		int bins = ffd.firstFitDecreasing(weights, 1.0D);
		end = System.nanoTime();
		System.out.print((bins - sum)+" ");
		System.out.print((end - start) / 1000000.0);
		System.out.println("");
	}

	private static void runBestFit(double weights[]) {
		//System.out.println("\n BEST FIT\n");
		BestFit bf = new BestFit();
		double sum = DoubleStream.of(weights).sum();
		//System.out.println("Sum :" + sum);
		start = System.nanoTime();
		int bins = bf.bestFit(weights, 1.0D);
		end = System.nanoTime();
		System.out.print((bins - sum)+" ");
		System.out.print((end - start) / 1000000.0);
		System.out.println("");
	}

	private static void runFirstFit(double weights[]) {
		//System.out.println("\n FIRST FIT\n");
		FirstFit ff = new FirstFit();
		double sum = DoubleStream.of(weights).sum();
		//System.out.println("Sum :" + sum);
		start = System.nanoTime();
		int bins = ff.firstFit(weights, 1.0D);
		end = System.nanoTime();
		System.out.print((bins - sum)+" ");
		System.out.print((end - start) / 1000000.0);
		System.out.println("");
	}

	private static void runNextFit(double weights[]) {
		//System.out.println("\n NEXT FIT\n");
		NextFit nf = new NextFit();
		double sum = DoubleStream.of(weights).sum();
		//System.out.println("Sum :" + sum);
		start = System.nanoTime();
		int bins = nf.nextFit(weights, 1.0D);
		end = System.nanoTime();
		//System.out.println("Count of bins:" + bins);
		System.out.print((bins - sum)+" ");
		System.out.print((end - start) / 1000000.0);
		System.out.println("");
	}

	public static double calculateWaste(int bins, double sumOfBins) {
		return bins - sumOfBins;
	}

	private static double[] readTestFile(String fileName) throws IOException {
		double arr[] = null;
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String str;
		while ((str = br.readLine()) != null) {
			String line[] = str.split(" ");
			arr = new double[line.length];
			for (int i = 0; i < line.length; i++) {
				arr[i] = Double.parseDouble(line[i]);
			}
		}
		return arr;
	}
}
