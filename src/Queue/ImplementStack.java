package Queue;

import java.util.LinkedList;
import java.util.Queue;

//Push the element in the queue which is non empty
//For poping the element first empty the q1 till it have one element only just return it to perform pop
public class ImplementStack {
      static class Stack{
//        Creating the two Ques's
      static Queue<Integer>q1=new LinkedList<>();
      static Queue<Integer>q2=new LinkedList<>();

//      empty
      public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

//        Push
        public static void push(int data){
          if (!q1.isEmpty()){
                q1.add(data);
            }
            else {
                q2.add(data);
            }
        }

//      pop
          public static int pop(){
          if (isEmpty()){
              System.out.println("Empty queue");
              return -1;
          }
          int front=-1;
          if(!q1.isEmpty()){      //case--1
              while (!q1.isEmpty()){
                  front=q1.remove();
                  if (q1.isEmpty()){
                      break;
                  }
                  q2.add(front);
              }
          }else {                //case-2
              while (!q2.isEmpty()){
                  front=q2.remove();
                  if (q2.isEmpty()){
                      break;
                  }
                  q1.add(front);
              }
          }
          return front;
          }

//          Peek
          public static int peek(){
              if (isEmpty()){
                  System.out.println("Empty queue");
                  return -1;
              }
              int front=-1;
              if(!q1.isEmpty()){          //case--1
                  while (!q1.isEmpty()){
                      front=q1.remove();
                      if (q1.isEmpty()){
                          break;
                      }
                      q2.add(front);
                  }
              }else {                    //case-2
                  while (!q2.isEmpty()){
                      front=q2.remove();
                      if (q2.isEmpty()){
                          break;
                      }
                      q1.add(front);
                  }
              }
              return front;
      }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(6);
        s.push(7);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
      }
}
