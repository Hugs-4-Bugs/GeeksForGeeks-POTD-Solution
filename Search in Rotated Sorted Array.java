class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int flag=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key) {
                flag=1;
                index=i;
                break;
            }
        }
        if(flag==1)
            return index;
        else
            return -1;
    }
}

