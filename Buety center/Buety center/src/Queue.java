
    /**
     * Created by user on 18/03/21.
     */
    public interface Queue<E> {
        boolean isEmpty();
        int size();
        E first();
        void enqueue( E element);
        E dequeue();

    }


