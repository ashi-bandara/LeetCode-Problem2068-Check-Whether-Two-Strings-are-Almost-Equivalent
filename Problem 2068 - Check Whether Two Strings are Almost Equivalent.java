class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] frequencyDiff = new int[26]; //store the differences in frequencies for each letter

        for (int i = 0; i < word1.length(); i++) {
            frequencyDiff[word1.charAt(i) - 'a']++; //increment the index corresponding to the letter when found
            frequencyDiff[word2.charAt(i) - 'a']--;
        }

        for (int diff : frequencyDiff) { 
            if (Math.abs(diff) > 3) {
                return false;
            }
        }
        return true;
    }
}
