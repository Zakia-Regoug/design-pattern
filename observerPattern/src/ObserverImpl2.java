public class ObserverImpl2 implements Observer {
    private int counter=0;
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl)observable).getState();
        if(state%2==0) ++counter;
        System.out.println("********** Observer Impl 2 *********");
        System.out.println("Nouvelle  mise a jour state : "+(state%2==0?"Pair":"Impair"));
        System.out.println("Compteur : "+counter);
    }
}
