import java.util.Random;

public class U1 extends Rocket {

    /**
     * Class constructor matching super, filled with rocket U2 info
     */
    U1() {
        super(100000000, 10000, 8000, 0);
    }

    /**
     * method that calculates the probability of a successful launch
     * @return true if the random probability is grater than the launch probability; false if the random probability is less than the probability of launch
     */
    @Override
    public Boolean launch() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLaunch = 0.05 * getCurrentWeight()/getMaxCargo();

        return !(chanceLaunch >= rand);
    }

    /**
     * method that calculates the probability of a successful landing
     * @return true if the random probability is grater than the landing probability; false if the random probability is less than the probability of landing
     */
    @Override
    public Boolean land() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLand = 0.01 * getWeight()/getMaxCargo();

        return !(chanceLand >= rand);
    }
}
