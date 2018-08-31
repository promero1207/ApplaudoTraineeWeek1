public class Item {
    /**
     * Class Attributes
     */
    private String name;
    private int weight;

    /**
     * Class Constructor
     * @param name Name of the object to be carried in the rocket
     * @param weight Weight of the object to be carried int the rocket
     */
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Setters and Getters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
