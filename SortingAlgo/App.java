public class App {
    public static void main(String[] args) {
        SortingProcessor.process(new SelectionSort());
        SortingProcessor.process(new MergeSort());
        SortingProcessor.process(new InsertionSort());
    }
}
