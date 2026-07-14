class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setList = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            if(setList.contains(nums[i])){
                return true;
            }
            setList.add(nums[i]);
        }
        return false;
    }
}