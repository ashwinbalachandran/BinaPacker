package firstFit;

public class FirstFit {

	public int firstFit(double weights[], double c) {
		int res = 0;
		double remBin[] = new double[weights.length];
		for (int i = 0; i < weights.length; i++) {
			int j = 0;
			for (; j < res; j++) {
				if (Double.compare(remBin[j], weights[i]) >= 0) {
					remBin[j] = remBin[j] - weights[i];
					break;
				}
			}
			if (j == res) {
				remBin[res] = c - weights[i];
				res++;
			}
		}
		return res;
	}
}
