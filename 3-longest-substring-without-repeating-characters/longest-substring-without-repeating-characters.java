class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seenCharacters = new HashSet<Character>();

		int max = 0;
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			while (seenCharacters.contains(s.charAt(right))) {
				seenCharacters.remove(s.charAt(left));
				left++;
			}
			seenCharacters.add(s.charAt(right));
			max = Math.max(max, right - left + 1);
		}

		return max;

    }
}