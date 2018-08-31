import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    /**
     * Method that loads all the items readed from the text document and fills an array whith them
     * @param path path for the file to be created
     * @return returns the list filled whith Items
     */
    public ArrayList<Item> loadItems(String path)  {
        ArrayList<Item> itemList = new ArrayList<Item>();
        File file = new File(path);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        if(scanner != null) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("=");
                itemList.add(new Item(line[0], Integer.parseInt(line[1])));
            }
        }

        return itemList;
    }

    /**
     * Method that loads all the items into rocket of type U1
     * @return returns a list of Rockets ready to launch
     */
    public ArrayList<Rocket> loadU1(String path)  {
        ArrayList<Item> itemList = loadItems(path);
        ArrayList<Rocket> u1ArrayList = new ArrayList<Rocket>();

        Rocket rocket = new U1();

        if(itemList.size() != 0) {
            for (int i = 0; i < itemList.size(); i++) {
                if (rocket.canCarry(itemList.get(i))) {
                    rocket.carry(itemList.get(i));
                } else {
                    u1ArrayList.add(rocket);
                    rocket = new U1();
                    rocket.carry(itemList.get(i));
                }
            }
            u1ArrayList.add(rocket);

        }
        return u1ArrayList;

    }

    /**
     * Method that loads all the items into rocket of type U2
     * @return returns a list of Rockets ready to launch
     */
    public ArrayList<Rocket> loadU2(String path)  {
        ArrayList<Item> itemList = loadItems(path);
        ArrayList<Rocket> u2ArrayList = new ArrayList<Rocket>();

        if(itemList.size() != 0) {
            Rocket rocket = new U2();
            for (int i = 0; i < itemList.size(); i++) {
                if (rocket.canCarry(itemList.get(i))) {
                    rocket.carry(itemList.get(i));

                } else {
                    u2ArrayList.add(rocket);
                    rocket = new U2();
                    rocket.carry(itemList.get(i));
                }
            }
            u2ArrayList.add(rocket);
        }
        return u2ArrayList;
    }

    /**
     * Method that runs the simulation of sending rockets to mars launching and landing
     * @param rockets list of rockets of type U1 or U2 filled to be sent to Mars
     * @return total cost of sending the rockets to Mars including crashed rockets
     */
    public int runSimulation(ArrayList<Rocket> rockets){
        int budget = 0;
        Boolean launching, landing;

        for(int i=0; i < rockets.size(); i++){
            launching = rockets.get(i).launch();
            landing = rockets.get(i).landing();

            if(launching && landing){
                budget += rockets.get(i).getCost();
            }
            else{

                while(!launching || !landing){
                    launching = rockets.get(i).launch();
                    landing = rockets.get(i).landing();
                    budget += rockets.get(i).getCost();
                }
                budget += rockets.get(i).getCost();
            }

        }

        return budget;
    }

}
