package queue;

public interface Queue<T> {
    Queue<T> enqueue(T element);
    T dequeue();
}
