package park;

import java.util.List;
import java.util.Map;

public class ParkManager {
    private Map<String,Boy> boyMap;

    public Boy getBoyByBoyName(String boyName){
        return boyMap.get(boyName);
    }

    public void setBoyMap(Map<String, Boy> boyMap) {
        this.boyMap = boyMap;
    }
}
