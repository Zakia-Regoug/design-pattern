public class Main {
    public static void main(String[] args) {
       ObservableImpl observable=new ObservableImpl();
       Observer o1=new ObserverImpl();
       Observer o2=new ObserverImpl2();
       Observer o3=new ObserverImpl();

       observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
       observable.setState(44);

        observable.setState(39);
        observable.setState(24);
    }
}