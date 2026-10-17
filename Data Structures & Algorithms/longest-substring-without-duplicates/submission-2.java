class Solution {
    public int lengthOfLongestSubstring(String s) {
        int firstP = 0;
        int secondP = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet();   //abcabcbb
        while (secondP < s.length()) {
            if(!hashSet.contains(s.charAt(secondP))){
                hashSet.add(s.charAt(secondP));
                secondP++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(firstP));
                firstP++;
            }
        }
        return max;
    }
}
