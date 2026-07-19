class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap <String, List<String>> map = new HashMap <>();

      for(String str:strs){
          char S[] = str.toCharArray();
          Arrays.sort(S);
          String check = new String(S);

          if(!map.containsKey(check)){
            map.put(check, new ArrayList<>());
          }

          map.get(check).add(str);
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