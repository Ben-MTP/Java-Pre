package com.tight.coupling;

import com.tight.coupling.services.VeryComplexService;

public class Main {
	public static void main(String[] args) {
		SortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		SortAlgorithm quickSort = new QuicksortAlgorithm();
		
		VeryComplexService business1 = new VeryComplexService(bubbleSort);
		business1.complexBusiness(null);
		
		VeryComplexService business2 = new VeryComplexService(quickSort);
		business2.complexBusiness(null);
	}
}
