class Pair{
   int x;
   int y;
   public Pair(int x,int y)
   {
       this.x = x;
       this.y = y;
   }
}

class Solution
{
    // Function to calculate the minimum number of sprinklers required
    int min_sprinklers(int gallery[], int n)
    {
        // Create a list to store the sprinklers
        List <Pair> sprinklers = new ArrayList<>();
        // Loop through the gallery array
        for(int i=0; i<n; i++)
            // Check if the gallery is not blocked
            if(gallery[i] > -1)
                // Add the sprinkler coordinate range to the list
                sprinklers.add( new Pair( i-gallery[i], i+gallery[i] ) );
        
        // Sort the sprinklers list based on the starting coordinate
        Collections.sort(sprinklers, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1,Pair p2)
            {
                return p1.x - p2.x;
            }
            
        });
        
        int target=0, sprinklers_on=0, i=0;
        // Iterate until target reaches the end of the gallery
        while(target<n)
        {
            // Check if there are no more sprinklers or the next sprinkler is beyond the target coordinate
            if(i==sprinklers.size() || sprinklers.get(i).x>target)
                // Return -1 indicating no solution
                return -1;
            
            int max_range = sprinklers.get(i).y;
            // Check if there are more sprinklers within the range of the target coordinate
            while( i+1<sprinklers.size() && sprinklers.get(i+1).x<=target )
            {
                i++;
                // Update the maximum range
                max_range = Math.max( max_range,  sprinklers.get(i).y );
            }
            // Check if the maximum range is less than the target coordinate
            if(max_range<target)
                // Return -1 indicating no solution
                return -1;
            
            // Increment the number of sprinklers turned on
            sprinklers_on++;
            // Update the target coordinate to the maximum range plus one
            target = max_range +1;
            // Move to the next sprinkler
            i++;
        }
        
        // Return the total number of sprinklers turned on
        return sprinklers_on;
    }



}
