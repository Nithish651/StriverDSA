package hashing;

public class Characterhashing {

	
	//TC : O(String length)
	//SC : O(26) for upper and lower case letters. O(256) when case is not mentioned.
	public static int count(String s, char ch) {
		int[] hash = new int[26];

		for (int i = 0; i < s.length(); i++) {
			// for lower case letters
			hash[s.charAt(i) - 'a']++;
			// for upper case letters
			// hash[s.charAt(i) - 'A']++;

			// when case is not specified. you can take the entire span of 256 characters.
			// hash[ch]++;
		}

		return hash[ch - 'a'];
	}

	public static void main(String[] args) {
		System.out.println(count("aaa", 'a'));
	}

}
