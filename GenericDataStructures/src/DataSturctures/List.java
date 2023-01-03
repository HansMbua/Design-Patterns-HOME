package DataSturctures;

public class List<T> {

    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name;


    // construtor creates empty list with "list" as the name

    public List(){
        this("List");

    }

    public List(String name) {
        this.name = name;
        firstNode = lastNode = null;

    }

    // inserting items at the front of the list
    public void insertAtFront(T insertItems){
        // check if Node is Empty if yes insert data
        if (isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItems);
        }
        else {
            // if its not empty means since the is already data inside the listNote insert the next
            firstNode = new ListNode<>(insertItems,firstNode);

        }
    }

    //insert items at the end of a list
    public void insertAtBack(T insertItem){
        if (isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItem);

        }
        else
            lastNode = lastNode.nextNote = new ListNode<>(insertItem);
    }

    // remove first node from list
    public T removeFromFront() throws EmptyListException
    {
        if (isEmpty()){
            throw new EmptyListException(name);
        }
        T removedItem = firstNode.data; // retrieve the data being removed;
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else {
            firstNode = firstNode.nextNote;
        }

        return removedItem;
    }

    // remove from back ie remove the last Node
    public T removeFromBack() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException(name);
        }


    }




}
