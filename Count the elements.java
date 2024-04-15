class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        // step - 1  <create arrayList for easy handler>
        ArrayList <Integer> ans= new ArrayList<>();
        

// step - 2  <Count occurance by loop>
        for(int i=0;i<query.length;i++){
            int index = query[i];                       //    Get Index
            int element = a[index];               //   Get Element 
            int count = 0;                              //   Counter
            for(int j=0;j<n;j++){                       // Count Element
                if(b[j] <= element){
                    count++;
                }
            }
            ans.add(count);             // Store count in arrayList
        }
        // step-3     Final Array for returning
        int arr[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
