package Context;

import Strategy.SortingStrategy;

public class SortingContext {
    //@Autowired
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public SortingStrategy getSortingStrategy() {
        return sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] listOfThingsToSort){
        this.sortingStrategy.sort(listOfThingsToSort);
    }
}
