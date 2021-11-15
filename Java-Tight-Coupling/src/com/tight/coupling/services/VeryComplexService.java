package com.tight.coupling.services;

import com.tight.coupling.SortAlgorithm;

public class VeryComplexService {
	private SortAlgorithm sortAlgorithm;

	// constructor:
	public VeryComplexService(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public void complexBusiness(int array[]) {
		sortAlgorithm.sort(array);
	}
	
}
