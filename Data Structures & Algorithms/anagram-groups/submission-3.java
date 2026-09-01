class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray(); // creating a array for the characters
            Arrays.sort(charArray); // sorting the char array alphabatically
            String sortedS = new String (charArray); //creating a new string for the sorted array
            res.putIfAbsent(sortedS, new ArrayList<>()); // if the sorted array isnt there already create
                                                         // create a new group
            res.get(sortedS).add(s); // i dont know what this does
        }

        return new ArrayList<>(res.values()); // out put the original array but sorted with the others
    }
}
