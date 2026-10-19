class Solution {
    public int search(int[] nums, int target) {
        int init = 0;
        int last = nums.length - 1;
        int mid = (init-last)/2;

        while (init <= last){
             mid = init + (last-init)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                init = mid +1;
            } else {
                last = mid -1;
            }

        }
        return -1;
    }
}
