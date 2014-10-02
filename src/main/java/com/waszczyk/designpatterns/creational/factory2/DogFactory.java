package com.waszczyk.designpatterns.creational.factory2;

class DogFactory {
	public static Dog getDog(String criteria) {
		if (criteria.equals("small"))
			return new Poodle();
		else if (criteria.equals("big"))
			return new Rottweiler();
		else if (criteria.equals("working"))
			return new SyberianHusky();

		return null;
	}
}
