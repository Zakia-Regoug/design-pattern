public class TauxMaroc implements Taux {

    @Override
    public float calulerTaux(float salaireBrutMensuel) {
        float salaireBrutAnuel=salaireBrutMensuel*12;
        if(salaireBrutAnuel<40000) return 5;
        else if (salaireBrutAnuel>40000 && salaireBrutAnuel<12000) {
            return 20;
        }
        else return 42;
    }
}
