package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

public class HappyFortuneService implements FortuneService {

	
	public String getFortune() {
		String[] fortune = new String[5];
		fortune[0]="Lucky day";
		fortune[1]="Very lucky day!";
		fortune[2]="Unfortune day";
		fortune[3]="Great day";
		fortune[4]="You just won main prize in Lotto!";
		int i = (int) (Math.random() *4)+0;
		
		return fortune[i] ;
	}

	@Override
	public List<Integer> getLottoNumbers() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int a = (int) (Math.random() *40) +1;
			list.add(a);
		}
		return list;
	}

}
