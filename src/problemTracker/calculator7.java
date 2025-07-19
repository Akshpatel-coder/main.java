package problemTracker;
import java.util.NoSuchElementException;


import java.util.*;

public class calculator7 {


    static class PriorityItem<T> {
        private T item;
        private int priority;


        public PriorityItem(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }


        public T getItem() {
            return item;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return item + " (priority " + priority + ")";
        }
    }

      static class MyPriorityQueue<T> {
        private List<PriorityItem<T>> items = new ArrayList<>();

        public void enqueue(T item, int priority) {
            items.add(new PriorityItem<>(item, priority));
        }

        public PriorityItem<T> dequeue() {
            if (items.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }

            sortDescending();
            return items.remove(0);
        }

        public PriorityItem<T> peek() {
            if (items.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");


            }


            sortDescending();
            return items.get(0);
        }

        public boolean isEmpty() {
            return items.isEmpty();

        }

        public int size() {
            return items.size();
        }

        private void sortDescending() {
            items.sort((a, b) -> Integer.compare(b.getPriority(), a.getPriority()));
        }
    }

    public static void main(String[] args) {
        MyPriorityQueue<String> pq = new MyPriorityQueue<>();

        System.out.println("Adding tasks to priority queue...");
        pq.enqueue("Answer emails", 2);
        pq.enqueue("Fix website bug", 5);
        pq.enqueue("Team lunch", 1);
        pq.enqueue("Meeting with client", 3);
        pq.enqueue("Server outage", 5);

        System.out.println("\nTasks in queue: " + pq.size());

        PriorityItem<String> nextTask = pq.peek();
        System.out.println("Next task: " + nextTask);

        System.out.println("\nProcessing all tasks:");
        while (!pq.isEmpty()) {
            PriorityItem<String> task = pq.dequeue();
            System.out.println("Completed: " + task);
        }

        System.out.println("\nQueue empty? " + pq.isEmpty());

        try {
            pq.peek();
            System.out.println("ERROR: peek() should throw exception on empty queue");
        } catch (NoSuchElementException e) {

            System.out.println("Success: peek() correctly threw NoSuchElementException on empty queue");
        } catch (Exception e) {

            System.out.println("ERROR: Wrong exception thrown: " + e.getClass().getSimpleName());

        }
    }
}