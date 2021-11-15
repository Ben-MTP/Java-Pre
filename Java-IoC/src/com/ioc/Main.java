package com.ioc;

import com.ioc.entity.Bikini;
import com.ioc.entity.Girl;
import com.ioc.entity.Outfit;

public class Main {
	public static void main(String[] args) {
		Outfit bikini = new Bikini();
		
		Girl girl1 = new Girl(bikini);
		System.out.println(girl1.getOutfit());
	}
}
