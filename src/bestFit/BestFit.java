package bestFit;

public class BestFit {

	public int bestFit(double weights[], double c) {
		int res = 0;
		double remBin[] = new double[weights.length];
		for(int i=0;i<weights.length;i++) {
			int j = 0;
			double min = c+0.1D;
			int ind = 0;
			for(;j<res;j++) {
				if((Double.compare(remBin[j],weights[i])>=0) && (Double.compare(remBin[j]-weights[i], min)<0)) {
					ind = j;
					min  = remBin[j] - weights[j];
				}
			}
			if(Double.compare(min,(c+0.1D))==0) {
				remBin[res] = c - weights[i];
				res++;
			}
			else
				remBin[ind] -= weights[i];
		}
		return res;
	}
}
