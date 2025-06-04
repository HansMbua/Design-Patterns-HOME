package ConcreteStrategies;

import Strategy.SortingStrategy;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting using merge Sort");
    }
}
