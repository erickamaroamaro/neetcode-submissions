class Solution {
    public int maxArea(int[] heights) {
        
        int firstP = 0;
        int secondP = heights.length -1;
        int maxArea = 0;

        for(int i =0; i <= heights.length; i++) {
            int temp = (secondP - firstP) * Math.min(heights[firstP], heights[secondP]);
            if(heights[firstP] < heights[secondP]){
                firstP++;
            } else if(secondP != 0){
                secondP--;
            }
            if(temp > maxArea) {
                maxArea = temp;
            }
        }
        System.out.println(maxArea);
        return maxArea;
    }
}
