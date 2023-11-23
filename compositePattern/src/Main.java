import composants.File;
import composants.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("Design pattern");
        Folder d1=(Folder) root.addComposant(new Folder("Comportement"));
        Folder d2=(Folder) root.addComposant(new Folder("Structure"));
        Folder d3=(Folder) root.addComposant(new Folder("Creation"));
        File f11=(File) d1.addComposant(new File("Strategy"));
        File f12=(File) d1.addComposant(new File("Observer"));
        File f21=(File) d2.addComposant(new File("Decorator"));
        File f22=(File) d2.addComposant(new File("Composite"));
        File f31=(File) d3.addComposant(new File("Singlotant"));
        File f32=(File) d3.addComposant(new File("Builder"));
        root.show();

    }
}