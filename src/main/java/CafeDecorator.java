

public abstract class CafeDecorator implements Cafe{

    private Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public abstract String getNomeBebida();
    public abstract float getPrecoBebida();

    @Override
    public float preco() {
        return 2.0f + getPrecoBebida();
    }

    @Override
    public String nome() {
        return "Café com "+ getNomeBebida();
    }


}
