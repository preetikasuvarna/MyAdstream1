package dataObjects;

/**
 * Created by Preetika.Suvarna on 17/05/2017.
 */
public class ContextDataObject {
    boolean level1, level2, level3 = false;

    public ContextDataObject() {
        level1 = false;
        level2 = false;
        level3 = false;
    }

    public void setLevel1State(boolean setState ) {
        level1 = setState;
    }

    public boolean getLevel1State() {
        return level1;
    }

    public void setLevel2(boolean setState) {
        level2 = setState;
    }

    public boolean getLevel2State() {
        return level2;
    }

    public void setLevel3State(boolean setState) {
        level3 = setState;
    }

    public boolean getLevel3State() {
        return level3;
    }
}
