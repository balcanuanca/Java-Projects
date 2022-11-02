import java.util.Comparator;

public class SortByFamilySize implements Comparator<Family> {

    public int compare(Family a, Family b){
        return b.getSize() - a.getSize();
    }
}
