package DataSturctures;

public class ListNode<T> {

    T data;
    ListNode<T> nextNote;

    ListNode(T object){
        this(object, null);
    }

    public ListNode(T data, ListNode<T> nextNote) {
        this.data = data;
        this.nextNote = nextNote;

    }

    public T getData() {
        return data;
    }

    public ListNode<T> getNextNote() {
        return nextNote;
    }
}
