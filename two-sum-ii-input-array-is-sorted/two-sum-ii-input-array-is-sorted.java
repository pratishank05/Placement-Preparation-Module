class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans1 = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            if(numbers[start]+ numbers[end]< target){
                start = start +1;
            }
            else if (numbers[start] + numbers[end] > target){
                end=end-1;
            }
            else {
                
                ans1[0]=start+1;
                ans1[1]=end+1;
                return ans1;
            }
        }
        return ans1;
    }
}