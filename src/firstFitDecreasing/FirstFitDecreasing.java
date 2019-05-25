package firstFitDecreasing;

import java.util.Arrays;
import java.util.Collections;

public class FirstFitDecreasing {
	
	public int firstFitDecreasing(double weights[], double c) {
		int res = 0;
		Double weightsSorted[] = sortArray(weights);
		double remBin[] = new double[weightsSorted.length];
		for (int i = 0; i < weightsSorted.length; i++) {
			int j = 0;
			for (; j < res; j++) {
				if (Double.compare(remBin[j], weightsSorted[i]) >= 0) {
					remBin[j] = remBin[j] - weightsSorted[j];
					break;
				}
			}
			if (j == res) {
				remBin[res] = c - weightsSorted[i];
				res++;
			}
		}
		return res;
	}
	private Double[] sortArray(double[] weights) {
		Double temp[] = new Double[weights.length];
		for(int i =0;i<weights.length;i++) {
			temp[i] = weights[i];
		}
		Arrays.sort(temp,Collections.reverseOrder());
		return temp;
	}
}
