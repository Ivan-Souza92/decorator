
public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getNomeBebida() {
        return "Leite";
    }

    @Override
    public float getPrecoBebida() {
        return 1.0f;
    }
}