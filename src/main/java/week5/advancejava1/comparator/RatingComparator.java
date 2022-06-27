package week5.advancejava1.comparator;

import java.util.Comparator;

import week5.advancejava1.data.Tshirt;

public class RatingComparator implements Comparator<Tshirt> {

	public int compare(Tshirt tshirt1, Tshirt tshirt2) {
		
		return (int)(tshirt2.getRating()-tshirt1.getRating());
	}
}
