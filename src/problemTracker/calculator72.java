package problemTracker;
import java.util.ArrayList;
import java.util.EmptyStackException;


    public class calculator72 {

        public static void main(String[] args) {

            Stack<Integer> stack = new Stack<>();
            stack.push(5);
            stack.push(3);
            stack.push(8);

              System.out.println("Items in stack: " + stack.size());
            System.out.println("Top item: " + stack.peek());

              System.out.println("Popping all items:");
              while(!stack.isEmpty()) {
                  System.out.println("Popped: " + stack.pop());
               }

            System.out.println("Stack empty? " + stack.isEmpty());


        }
    }

    class Stack<T> {
        private ArrayList<T> items = new ArrayList<>();

        public void push(T item) {
            items.add(item);
        }

        public T pop() {
            if(isEmpty()) throw new EmptyStackException();
            return items.remove(items.size()-1);
        }

        public T peek() {
            if(isEmpty()) throw new EmptyStackException();
            return items.get(items.size()-1);
        }

        public boolean isEmpty() {
            return items.isEmpty();
        }


        public int size() {
            return items.size();
        }
    }

