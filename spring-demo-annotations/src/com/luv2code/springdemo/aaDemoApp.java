package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class aaDemoApp {

	public static void main(String[] args) {
		/*AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(aaConfigFile.class); 
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
	*/
		int k = 3;
		int n = 6;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(8);
		arr.add(10);
		arr.add(12);
		reverseInGroups(arr,n,k);
	}
		public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
			int[] first = new int[k];
	        for (int i =0; i<k;i++){
	            first[i]=arr.get(i);
	        }
	        int[] second = new int[n-k];
	        int a =0;
	        for (int i = k; i<arr.size();i++){
	            second[a] = arr.get(i);
	                    a++;
	        }
	        for (int b : first){
	            System.out.print(b + " ");
	        }
	        for (int c: second){
	            System.out.print(c + " ");
	        }
	    }
	}


