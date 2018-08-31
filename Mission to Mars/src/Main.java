import java.util.ArrayList;

public class Main {

    public static void main(String [] args)  {
        String phase1 = "/Users/paul_/Desktop/phase1.txt";
        String phase2 = "/Users/paul_/Desktop/phase2.txt";

        Simulation simulation = new Simulation();

        ArrayList<Rocket> u1Phase1ArrayList = simulation.loadU1(phase1);
        ArrayList<Rocket> u1Phase2ArrayList = simulation.loadU1(phase2);

        ArrayList<Rocket> u2Phase1ArrayList = simulation.loadU2(phase1);
        ArrayList<Rocket> u2Phase2ArrayList = simulation.loadU2(phase2);

        int totalU1 = (simulation.runSimulation(u1Phase1ArrayList)+simulation.runSimulation(u1Phase2ArrayList));
        int totalU2 = (simulation.runSimulation(u2Phase1ArrayList)+simulation.runSimulation(u2Phase2ArrayList));

        if(u1Phase1ArrayList.size()!= 0 && u1Phase2ArrayList.size() != 0) {
            System.out.println("U1 Total Cost: " + totalU1);
            System.out.println("U2 Total Cost: " + totalU2);
        }

        if(totalU1 < totalU2){
            System.out.println("U1 Rockets are cheaper for this simulation");
        }
        else{
            System.out.println("U2 Rockets are cheaper for this simulation");
        }

    }

}
