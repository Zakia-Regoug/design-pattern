package template;

public class TemplateImpl2 extends TemplateClass{
    @Override
    protected double filter1(String str) {
        return Math.pow(str.length(),2);
    }

    @Override
    protected double filter2(double d) {
            return 9*d;
    }
}
