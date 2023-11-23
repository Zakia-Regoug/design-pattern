public class ObserverImpl implements Observer {
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl)observable).getState();
        double res=state*state+9;
        System.out.println("********** Observer Impl 1 *********");
        System.out.println("Nouvelle  mise a jour state : "+state);
        System.out.println("Resultat : "+res);
    }
}
