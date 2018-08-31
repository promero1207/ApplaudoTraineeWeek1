public class Rocket implements SpaceShip {

    /**
     * Class fields
     */

    private Integer cost;
    private Integer weight;
    private Integer maxCargo;
    double chanceLaunch;
    double chanceLand;
    private Integer currentWeight;


    /**
     *
     * @param cost rocket cost for U1 or U2
     * @param weight rocket weight for U1 or U2
     * @param maxCargo rocket maximum load for U1 or U2
     * @param currentWeight rocket current weight for U1 or U2
     */
    Rocket(Integer cost, Integer weight, Integer maxCargo, Integer currentWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxCargo = maxCargo;
        this.currentWeight = currentWeight;
    }

    /**
     * Inherited methods from parent class Spaceship
     */
    @Override
    public Boolean launch() {
        return true;
    }

    @Override
    public Boolean land() {
        return true;
    }

    @Override
    public Boolean canCarry(Item item) {
        return maxCargo >= (currentWeight + item.getWeight());
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();
    }


    /**
     * Setters and Getters
     */

    Integer getCost() {
        return cost;
    }

    Integer getWeight() {
        return weight;
    }

    Integer getMaxCargo() {
        return maxCargo;
    }

    Integer getCurrentWeight() {
        return currentWeight;
    }


}
