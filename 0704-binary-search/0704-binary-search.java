class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length==1 && target==nums[0])return 0;
        int low=0,high=nums.length-1;
        int mid=0;
            while(low<=high){
                mid=(low+high)/2;
                if(nums[mid]==target)return mid;
                else if(nums[mid]<target)low=mid+1;
                else high=mid-1;
            }
            return -1;
        }
    }
