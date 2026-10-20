class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap <String, List<String>> map = new HashMap <>();
        for(String str:strs){
            char s[] = str.toCharArray();
            Arrays.sort(s);
            String check = new String(s);

            if(!map.containsKey(check)){
                map.put(check, new ArrayList <>());
            }
            map.get(check).add(str);
        }

        return new ArrayList<>(map.values());

    }
}