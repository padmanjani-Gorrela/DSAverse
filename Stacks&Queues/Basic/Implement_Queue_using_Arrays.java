/*
Implement a First-In-First-Out (FIFO) queue using an array. The implemented queue should support the following operations: push, peek, pop, and isEmpty.
Implement the ArrayQueue class:

void push(int x): Adds element x to the end of the queue.
int pop(): Removes and returns the front element of the queue.
int peek(): Returns the front element of the queue without removing it.
boolean isEmpty(): Returns true if the queue is empty, false otherwise.
*/

class Queue{
  int[] arr;
  int start,end;
  int curr_size, maxSize;
  Queue(){
    arr = new int[10];
    start = -1;
    end = -1;
    curr_size = 0;
    maxSize = 10;
  }
  public void push(int x){
    if(curr_size == maxSize){
      System.out.println("Queue is full");
      System.exit(1);
    }
    if(end = -1){
      start = 0;
      end = 0;
    }
    else end = (end + 1)%size;
    arr[end] = x;
    curr_size++;
  }
  public int pop(){
    
