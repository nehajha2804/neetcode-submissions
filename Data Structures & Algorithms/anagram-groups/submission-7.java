class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
     HashMap <String, List<String>> map = new HashMap <>();
       for(String str:strs){
        char[] s=str.toCharArray();
        Arrays.sort(s);
        String S = new String(s);

        if(!map.containsKey(S)){
            map.put(S,new ArrayList<>());
        }
            map.get(S).add(str);
       
    }
     return new ArrayList<>(map.values());

    }

    //  HashMap <String, List<String>> map = new HashMap <>();

    //   for(String str: strs){
    //     char[] c = str.toCharArray();
    //     Arrays.sort(c);
    //     String sorted = new String(c);

    //     if(!map.containsKey(sorted)){
    //         map.put(sorted, new ArrayList<>());
    //     }
    //     map.get(sorted).add(str);
       
    //   }

    //   return new ArrayList<>(map.values());
}