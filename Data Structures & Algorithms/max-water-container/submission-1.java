class Solution {
    public int maxArea(int[] heights) {
        HashMap <Double, Integer> map = new HashMap <>();
        
        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){
                int length = Math.min(heights[i],heights[j]);
                int width = Math.abs(i-j);
                double volume = length * width;
                // System.out.print( i + "/");
                // System.out.print( j + "/");
                // System.out.print(length + "/");
                // System.out.print(width + "/");
                // System.out.println(volume + "//");
                // System.out.println();
      
                map.put(volume,1);  
            }
            // System.out.println();
        }
        // System.out.println(map);
        double output =  Collections.max(map.keySet());
        int new_output = (int) output;
        return new_output;
        
    }
}
