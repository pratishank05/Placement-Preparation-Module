class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;int r= nums.length-1; int ans=-1;
       outer: while(l<=r)
        {
            int mid=(l+r)/2;
            if(target==nums[mid])
            {
                ans=mid;
                break outer;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(ans==-1)
        {
            return l;
        }
        else{
            return ans;
        }
    }
}