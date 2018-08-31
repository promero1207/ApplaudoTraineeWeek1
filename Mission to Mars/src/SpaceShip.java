public interface SpaceShip {

    /**
     * Method for launching the rocket
     * It calculates thr probability of a successful launching
     * It compares with a random number
     * @return true if the probability is grater than the random number; false if the probability is less than the random number
     */
    Boolean launch();

    /**
     * Method for landing the rocket
     * It calculates thr probability of a successful landing
     * It compares with a random number
     * @return true if the probability is grater than the random number; false if the probability is less than the random number
     */
    Boolean land();

    /**
     * Method that verifies that the rocket has space for caring an item
     * @param item Item to be carried in the rocket
     * @return true if the rocket actual weight is less than the max cargo capacity; false if the rocket actual weight is grater than the max cargo capacity;
     */
    Boolean canCarry(Item item);

    /**
     * Method to carry the Item it ads the actual rocket weight plus the Item weight
     * @param item Item to be carried
     */
    void carry(Item item);
}
