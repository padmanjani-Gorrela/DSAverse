/*
Implement a Last-In-First-Out (LIFO) stack using an array. The implemented stack should support the following operations: push, pop, peek, and isEmpty.
Implement the ArrayStack class:
void push(int x): Pushes element x onto the stack.
int pop(): Removes and returns the top element of the stack.
int top(): Returns the top element of the stack without removing it.
boolean isEmpty(): Returns true if the stack is empty, false otherwise.
*/


class Stack{
  int cap;
  private int[] stack;
  int top;
  Stack(int cap, int[] stack, int top){
    this.cap = cap;
    stack = new int[cap];
    top = -1;
  }
  public void push(int x){
    if(top >= cap - 1){
      System.out.println("Stack overflow");
      return;
    }
    top = top + 1;
    stack[top] = x;
  }
  public void pop(){
    if(stack.isEmpty()){
      System.out.println("Stack is empty");
      return - 1;
    }
    int res = stack[top];
    top = top - 1;
    return res;
  }
  public int top(){
    if(stack.isEmpty()){
      System.out.println("Stack is empty");
      return -1;
    }
    return st[top];
  }

  public boolean isEmpty(){
    return top == -1;
  }
}

      
