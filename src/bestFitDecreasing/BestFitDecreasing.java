package bestFitDecreasing;

import java.util.Arrays;
import java.util.Collections;

public class BestFitDecreasing {
	
	public int bestFit(double weights[], double c) {
		int res = 0;
		Double weightsSorted[] = sortArray(weights);
		double remBin[] = new double[weightsSorted.length];
		for(int i=0;i<weightsSorted.length;i++) {
			int j = 0;
			double min = c+0.1D;
			int ind = 0;
			for(;j<res;j++) {
				if((Double.compare(remBin[j],weightsSorted[i])>=0) && (Double.compare(remBin[j]-weightsSorted[i], min)<0)) {
					ind = j;
					min  = remBin[j] - weightsSorted[j];
				}
			}
			if(Double.compare(min,(c+0.1D))==0) {
				remBin[res] = c - weightsSorted[i];
				res++;
			}
			else
				remBin[ind] -= weightsSorted[i];
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
