import java.util.Random;

public class U2 extends Rocket {

    /**
     * Class constructor matching super, filled with rocket U1 info
     */
    public U2() {
        super(120000000, 18000, 11000, 0, 0);
    }

    /**
     * method that calculates the probability of a successful launch
     * @return true if the random probability is grater than the launch probability; false if the random probability is less than the probability of launch
     */
    @Override
    public Boolean launch() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLaunch = 0.04 * getCurrentWeight()/getMaxCargo();

        if(chanceLaunch >= rand){
            return false;
        }
        else{
            return true;
        }
    }


    /**
     * method that calculates the probability of a successful landing
     * @return true if the random probability is grater than the landing probability; false if the random probability is less than the probability of landing
     */
    @Override
    public Boolean landing() {
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        chanceLand = 0.08 * getWeight()/getMaxCargo();

        if(chanceLand >= rand){
            return false;
        }
        else{
            return true;
        }
    }
}
