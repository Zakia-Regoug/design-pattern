import state.Avion;
import state.AvionImpl;

public class Main {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.doActivity();
        avion.entrezAuGarage();
        avion.doActivity();
        avion.atterir();
        avion.doActivity();
        avion.sortirDuGarage();
        avion.decoller();
        avion.doActivity();
    }
}
