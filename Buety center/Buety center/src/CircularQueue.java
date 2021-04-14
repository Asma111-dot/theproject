/**
 * Created by user on 18/03/21.
     */
    public class CircularQueue<E> implements CQueue<E> {
        private CircularlyLinkedList<E>list= new CircularlyLinkedList<E>();

        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public E first() {
            return list.first();
        }

        @Override
        public void enqueue(E element) {
            list.addLast(element);
        }

        @Override
        public E dequeue() {
            return list.removeFirst();
        }

        @Override
        public void rotate() {
            list.rotate();
        }
    }


