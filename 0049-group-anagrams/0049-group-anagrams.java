class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            
            String originalString = strs[i];
            
            //take every string and convert it into char array and sort it
            char[] ch = originalString.toCharArray();
            Arrays.sort(ch);
            
            //convert the char array again into a string
            String newString = String.valueOf(ch);

            if (!map.containsKey(newString)) {
                map.put(newString, new ArrayList<>());
            }
            
            //map.get(newString) will give us a list ans we need to add in that list
            
            map.get(newString).add(originalString);
        }
        return new ArrayList<>(map.values());
    }
}