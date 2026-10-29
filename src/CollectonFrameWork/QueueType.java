package CollectonFrameWork;

import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class QueueType {
        public static void main(String[] args) {

            Queue<Integer>queue = new PriorityQueue<>();

            queue.offer(30);
            queue.offer(10);
            queue.offer(60);
            queue.offer(5);
            System.out.println(queue);
            System.out.println("PriorityQueue: " + queue);
            System.out.println("Peek: " + queue.peek());
            System.out.println(Collections.max(queue));
            System.out.println(Collections.min(queue));

            System.out.println("Poll: " + queue.poll());
            System.out.println("Poll: " + queue.poll());
            System.out.println("After removal: " + queue);

            Deque<Integer> deque = new ArrayDeque<>();

            deque.addFirst(20);
            deque.addFirst(10);
            deque.addLast(30);
            deque.addLast(40);

            System.out.println("Deque: " + deque);
            System.out.println("First: " + deque.peekFirst());
            System.out.println("Last: " + deque.peekLast());
            System.out.println("Removed first: " + deque.pollFirst());
            System.out.println("Removed last: " + deque.pollLast());
            System.out.println("After removal: " + deque);


                    Queue<Integer> lis = new LinkedList<>();

                    lis.offer(30);
                    lis.offer(10);
                    lis.offer(60);
                    lis.offer(5);

                    System.out.println(lis);

                    System.out.println("Peek: " + lis.peek());

                    System.out.println("Poll: " + lis.poll());

                    System.out.println("After poll: " + lis);
                }

            }




