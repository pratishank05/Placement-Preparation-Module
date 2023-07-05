class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int len=nums.length;
        int count=0;
        for(int i:nums){
            if(i==0)count++;
        }
        if(count==0)return;
        int point=0;
        for(int i=0;i<len;i++)
        {
            int ele=nums[i];
            if(nums[i]!=0)
            {
                nums[point]=ele;
                point++;
            }
        }
        while(count!=0 && point<nums.length)
        {
            nums[point]=0;
            point++;
            count--;
        }
        return;
    }
}