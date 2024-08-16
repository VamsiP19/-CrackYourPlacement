class MyQueue {
    Stack <Integer> myStack;
    Stack<Integer> queue;
    public MyQueue() {
        myStack = new Stack<>();
        queue = new Stack<>();
    }
    
    public void push(int x) {
        while(!myStack.isEmpty()){
            queue.push(myStack.pop());
        }
        myStack.push(x);

        while(!queue.isEmpty()){
            myStack.push(queue.pop());
        }
    }
    
    public int pop() {
        return myStack.pop();
    }
    
    public int peek() {
        return myStack.peek();
    }
    
    public boolean empty() {
        return myStack.isEmpty();
    }
}
