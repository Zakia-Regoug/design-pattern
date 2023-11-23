package template;

public class TemplateImpl1 extends TemplateClass{
    @Override
    protected double filter1(String str) {
        return Math.pow(str.length(),4);
    }

    @Override
    protected double filter2(double d) {
        return 2*d;
    }
}
