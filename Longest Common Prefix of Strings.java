class Solution {
    public String longestCommonPrefix(String arr[]) {
        int small=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].length()<arr[small].length())
                small=i;
        }
        String ans=arr[small];
        int i=0;
        int j=0;
        while(i<ans.length())
        {
            for(j=0;j<arr.length;j++)
            {
                if(arr[j].charAt(i)!=ans.charAt(i))
                    break;
            }
            if(j!=arr.length)
                break;
            i++;
        }
        if(i==0)
            return "-1";
        return ans.substring(0,i);
    }
}

