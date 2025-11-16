class MyStack {
private Queue<Integer> q;
    public MyStack() {  
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);                       // Step 1: Add new element
        int size = q.size();
        // Step 2: Rotate (size-1) elements
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();                  // Front is top of stack
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();}
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */