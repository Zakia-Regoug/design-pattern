public class Employe {
    private String cin;
    private float salaireBrutMensuel;

    //Ajouter attribut taux
    private Taux taux;
    public Employe(String cin, float salaireBrutMensuel) {

        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;

    }
    public Employe() {
    }

    public float calculerIGR(){

        float salaireBrutAnuel=salaireBrutMensuel*12;
        float tx=taux.calulerTaux(salaireBrutMensuel);
        return salaireBrutAnuel*tx/100;

    }
    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;

    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setTaux(Taux taux) {
        this.taux = taux;
    }
}