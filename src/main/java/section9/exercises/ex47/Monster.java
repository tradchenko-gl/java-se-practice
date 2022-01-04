package section9.exercises.ex47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, String.valueOf(this.hitPoints));
        values.add(2, String.valueOf(this.strength));
        return values;
    }

    @Override
    public void read(List<String> list) {
        if((list.size() > 0) && (list != null)){
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }

    }

    public String toString() {
        return "Monster{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + "'}";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
