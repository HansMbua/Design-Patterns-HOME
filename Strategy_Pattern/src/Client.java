import ConcreteStrategies.BubbleSortStrategy;
import ConcreteStrategies.MergeSortStrategy;
import Context.SortingContext;
import Strategy.SortingStrategy;

public class Client {
    public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        SortingContext bubbleSort = new SortingContext(new MergeSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        bubbleSort.performSort(array1);

    }
}