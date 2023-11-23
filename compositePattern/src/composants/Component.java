package composants;

public abstract class Component {
    protected String name;
    protected int level=0;

    public Component(String name) {
        this.name = name;
    }

    public abstract void show();

    public String tab(){
        String tb="";
        for(int i=0; i<level; i++){
            tb+="\t";
        }
        return tb;
    }
}
