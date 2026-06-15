class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer>  map = new HashMap <>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(char ch: sArr){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        for(int i=0; i<tArr.length; i++){
            if(!map.containsKey(tArr[i])){
                return false;
            }

            map.put(tArr[i], map.get(tArr[i])-1);

            if((map.get(tArr[i]))==0){
                map.remove(tArr[i]);
            }
        }

        return map.isEmpty();

    }
}
