package ConcreteStrategies;

import Strategy.SortingStrategy;

public class BubbleSortStrategy implements SortingStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("sorting using Bubble sort");
    }
}
