class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
          Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    
    // Create a max heap (priority queue) based on frequency
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
        if (frequencyMap.get(a).equals(frequencyMap.get(b))) {
            return b - a; // If frequencies are the same, prioritize the larger number
        }
        return frequencyMap.get(b) - frequencyMap.get(a);
    });
    
    for (int num : frequencyMap.keySet()) {
        maxHeap.offer(num);
    }
    
    // Get the top k frequent elements
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = maxHeap.poll();
    }
    
    return result;
    }
}
