
class Solution {
    static void permutation(ArrayList<Integer> arr, Set<ArrayList<Integer>> a, boolean[] marked,
			ArrayList<Integer> temp) {
		if (temp.size() == arr.size()) {
			a.add(new ArrayList<Integer>(temp));
			return;
		}
		for (int i = 0; i < arr.size(); i++) {
			if (marked[i]==false) {
				temp.add(arr.get(i));
				marked[i] = true;
				permutation(arr, a, marked, temp);
				marked[i] = false;
				temp.remove(temp.size()-1);
			}
		}
	}

	static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
		// code here
		Set<ArrayList<Integer>> set = new HashSet<>();
		boolean[] marked = new boolean[n];
		Arrays.fill(marked,false);
		Collections.sort(arr);
		permutation(arr, set, marked, new ArrayList<Integer>());
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>(set);
		Collections.sort(A, new Comparator<ArrayList<Integer>>(){
           @Override
           public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
               int comp = 0;
               for(int i=0;i<Math.min(a.size(), b.size());i++){
                   comp = Integer.compare(a.get(i), b.get(i));
                   if(comp != 0)
                       return comp;
               }
               return Integer.compare(a.size(), b.size());
           }
       });
		return A;
	}
};
