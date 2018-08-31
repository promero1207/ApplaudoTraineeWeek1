public interface SpaceShip {

    /***
     * Interfaces that have the actions for the rocket
     */
    Boolean launch();
    Boolean landing();
    Boolean canCarry(Item item);
    void carry(Item item);
}
