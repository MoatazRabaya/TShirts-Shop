public class Main {
    public static void main(String[] args) {

        Tshirt t = (new TshirtFactoryChinaStandard().createTshirt("small"));
        t = new TshirtRedDecorator(t);
        System.out.println(t.getDescription());
    }
}