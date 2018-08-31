public class Rocket implements SpaceShip {

    /**
     * Class Atributes
     */

    protected Integer cost;
    protected Integer weight;
    protected Integer maxCargo;
    protected double chanceLaunch;
    protected double chanceLand;
    protected Integer currentWeight;
    protected Integer totalCost;

    /**
     *
     * @param cost rocket cost for U1 or U2
     * @param weight rocket weight for U1 or U2
     * @param maxCargo rocket maximum load for U1 or U2
     * @param currentWeight rocket current weight for U1 or U2
     * @param totalCost rocket totalcost for U1 or U2
     */
    public Rocket(Integer cost, Integer weight, Integer maxCargo, Integer currentWeight, Integer totalCost) {
        this.cost = cost;
        this.weight = weight;
        this.maxCargo = maxCargo;
        this.currentWeight = currentWeight;
        this.totalCost = totalCost;

    }

    /**
     * Inherited methods from parent class Spaceship
     */
    @Override
    public Boolean launch() {
        return true;
    }

    @Override
    public Boolean landing() {
        return true;
    }

    @Override
    public Boolean canCarry(Item item) {
        if(maxCargo >= (currentWeight + item.getWeight())){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();
    }


    /**
     * Setters and Getters
     */

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(Integer maxCargo) {
        this.maxCargo = maxCargo;
    }

    public double getChanceLaunch() {
        return chanceLaunch;
    }

    public void setChanceLaunch(double chanceLaunch) {
        this.chanceLaunch = chanceLaunch;
    }

    public double getChanceLand() {
        return chanceLand;
    }

    public void setChanceLand(double chanceLand) {
        this.chanceLand = chanceLand;
    }

    public Integer getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Integer currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }
}
