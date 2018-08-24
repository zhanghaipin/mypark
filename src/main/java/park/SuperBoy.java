package park;

import java.util.Collections;
import java.util.Comparator;

/**
 * park car by parking empty rate
 */
public class SuperBoy extends Boy{

    @Override
    protected Park findPark() {
        Collections.sort(parks, new Comparator<Park>() {
            @Override
            public int compare(Park p1, Park p2) {
                return (p2.getEmptyRate()-p1.getEmptyRate()>=0?1:-1);
            }
        });
        Park park=parks.get(0);
        return park.isFull()?null:park;
    }
}
