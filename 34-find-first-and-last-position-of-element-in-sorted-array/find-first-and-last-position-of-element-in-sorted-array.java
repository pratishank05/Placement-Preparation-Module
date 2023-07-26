class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> arrli= new ArrayList<>();
        for(int i:nums)
        {
            arrli.add(i);
        }
        int[] ans= new int[2];
        ans[0]=arrli.indexOf(target);
        ans[1]=arrli.lastIndexOf(target);
        return ans;
    }
}