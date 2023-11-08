import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context=new Context();
        Scanner scanner = new Scanner(System.in);
        //declarer le cache map
        Map<String,Strategy> strategyMap=new HashMap<>();
        Strategy strategy;
        while(true){
            System.out.println("Precise strategy : ");
            String str=scanner.nextLine();
            strategy=strategyMap.get(str);
            //si la strategie n'existe pas dans la memoire
            if(strategy==null){
                //l'instancier
                System.out.println("Creation de strategy");
                strategy=(Strategy) Class.forName("StrategyImpl"+str).getConstructor().newInstance();
                //ajouter dans le cache
                strategyMap.put(str,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerStrategy();
        }

    }
}
