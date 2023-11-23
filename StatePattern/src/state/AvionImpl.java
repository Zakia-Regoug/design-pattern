package state;

public class AvionImpl implements Avion{
    private State state=new EtatEnPiste();
    @Override
    public void entrezAuGarage() {
        state.exentrezAuGarage();
    }

    @Override
    public void sortirDuGarage() {
        state.exsortirDuGarage();
    }

    @Override
    public void decoller() {
        state.exdecoller();
    }

    @Override
    public void atterir() {
        state.exatterir();
    }

    @Override
    public void doActivity() {
        state.exdoActivity();
    }

    abstract class State{
        abstract void exentrezAuGarage();
        abstract void exsortirDuGarage();
        abstract void exdecoller();
        abstract void exatterir();
        abstract void exdoActivity();

    }

    class EtatEnPiste extends State{

        @Override
        void exentrezAuGarage() {
            state=new EtatAuGarage();
            System.out.println("transition : piste => Garage");
        }

        @Override
        void exsortirDuGarage() {
            System.out.println("Impossible, Je suis deja en piste");
        }

        @Override
        void exdecoller() {
            state=new EtatEnAir();
            System.out.println("transition : piste => Air");
        }

        @Override
        void exatterir() {
            System.out.println("Impossible, je suis en piste");
        }

        @Override
        void exdoActivity() {
            System.out.println("En piste");
        }
    }
    class EtatAuGarage extends State{

        @Override
        void exentrezAuGarage() {
            System.out.println("Je suis deja au garage");
        }

        @Override
        void exsortirDuGarage() {
            state=new EtatEnPiste();
            System.out.println("transition : Garage => Piste");
        }

        @Override
        void exdecoller() {
            System.out.println("Impossible, je suis au garage");
        }

        @Override
        void exatterir() {
            System.out.println("Impossible, je suis au garage");
        }

        @Override
        void exdoActivity() {
            System.out.println("Au garage");
        }
    }
    class EtatEnAir extends State{

        @Override
        void exentrezAuGarage() {
            System.out.println("Impossible je suis en Air");
        }

        @Override
        void exsortirDuGarage() {
            System.out.println("Impossible je suis en Air");
        }

        @Override
        void exdecoller() {
            System.out.println("Je suis deja en air");
        }

        @Override
        void exatterir() {
            state=new EtatEnPiste();
            System.out.println("transition : Air => Piste");
        }

        @Override
        void exdoActivity() {
            System.out.println("En Air");
        }
    }


}

