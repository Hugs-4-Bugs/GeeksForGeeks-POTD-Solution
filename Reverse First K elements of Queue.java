class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
 
{
       Stack<Integer> stack = new Stack<>();

       // Push first k elements onto the stack
       for (int i = 0; i < k; i++) {
           stack.push(q.poll());
       }

       // Enqueue back the first k elements from the stack
       while (!stack.isEmpty()) {
           q.add(stack.pop());
       }

       // Move remaining elements to the back of the queue
       for (int i = 0; i < q.size() - k; i++) {
           q.add(q.poll());
       }

       return q;
   }
}
