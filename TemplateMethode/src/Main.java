import template.TemplateClass;
import template.TemplateImpl1;
import template.TemplateImpl2;

public class Main {
    public static void main(String[] args) {
        TemplateClass templateClass=new TemplateImpl1();
        System.out.println(templateClass.compute("hello"));
        templateClass=new TemplateImpl2();
        System.out.println(templateClass.compute("hello"));

    }
}
