package ch10;

import java.util.Comparator;
class StringComparator implements Comparator<String> {

	@Override
	public int compare(String a,String b) {
		return a.length() - b.length();
	}

}
