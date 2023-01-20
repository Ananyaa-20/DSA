class MyQueue {
    Stack<Integer> stack1,stack2;
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int a = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return a;
    }
    
    public int peek() {
         while(!stack1.empty())
            stack2.push(stack1.pop());
        
        int b = stack2.peek();

        while(!stack2.empty())
            stack1.push(stack2.pop());
        
        return b;
    }
    
    public boolean empty() {
        return stack1.empty();
    }
}
