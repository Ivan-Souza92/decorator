
public class Chocolate extends CafeDecorator{


    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getNomeBebida() {
        return "Chocolate";
    }

    @Override
    public float getPrecoBebida() {
        return 4.00f;
    }
}
