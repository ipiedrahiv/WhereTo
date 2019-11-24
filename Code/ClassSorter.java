import java.util.Comparator;

public class ClassSorter implements Comparator<Subject>
{
    /**
     *This method is used in the .sort() method in order to order classes by start time.
     */
    @Override
    public int compare(Subject s1, Subject s2) {
        return (s1.Start_time).compareTo(s2.Start_time);
    }
}
