class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String letters = new String(charArray);

            map.putIfAbsent(letters, new ArrayList<>());
            map.get(letters).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
