

public class Expresso implements Cafe{

    @Override
    public float preco() {
        return 6.00f;
    }

    @Override
    public String nome() {
        return "Café Expresso";
    }
}
