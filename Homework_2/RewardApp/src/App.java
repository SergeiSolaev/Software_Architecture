import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

public class App {
    public static void main(String[] args) throws Exception {

       List<ItemGenerator> generators = new ArrayList<>();

       generators.add(new GemGenerator());
       generators.add(new GoldGenerator());
       generators.add(new BronzeGenerator());
       generators.add(new DiamondGenerator());
       generators.add(new EmeraldGenerator());
       generators.add(new PlatinumGenerator());
       generators.add(new RubyGenerator());

       Random random = ThreadLocalRandom.current();

       generators.get(0).openReward();
       generators.get(1).openReward();
       generators.get(1).openReward();
       generators.get(1).openReward();

       for (int i = 0; i < 50; i++) {
           int index = random.nextInt(2,7);
           generators.get(index).openReward();
       }

    }
}
