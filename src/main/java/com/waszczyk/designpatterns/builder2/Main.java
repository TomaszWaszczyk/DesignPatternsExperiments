package com.waszczyk.designpatterns.builder2;

public class Main {

	public static void main(String[] args) {

        NutritionalFacts n = new NutritionalFacts.Builder(10).carbo(23).fat(1).build();
        System.out.println(n.toString());
	}

}
