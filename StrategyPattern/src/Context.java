


public class Context {
    private Strategy strategy=new DefaultStrategyImpl();
    public void effectuerStrategy(){
        System.out.println("*******************");
        strategy.operation();
        System.out.println(".........................");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
