package nextFit;

public class NextFit {

	public int nextFit(double weights[], double c) {
		int res = 1;
		double remBin = c;
		for(int i =0;i<weights.length;i++) {
			if(weights[i]>remBin) {
				res++;
				remBin = c - weights[i];
			}
			else {
				remBin -= weights[i];
			}
		}
		return res;
	}
}
