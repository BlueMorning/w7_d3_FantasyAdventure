public class BattleTool {

    private String name;
    private int power;


    public BattleTool(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int hasPower() {
        return this.power;
    }
}
