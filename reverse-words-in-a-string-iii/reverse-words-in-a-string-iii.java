class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder sb=new StringBuilder(arr[i]);
            ans.append(sb.reverse());
            ans.append(" ");
        }
        String a=ans.toString();
        a=a.trim();
        return a;
    }
}