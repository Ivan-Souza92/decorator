import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void retornaPrecoCafeExpresso(){

        Cafe cafe = new Expresso();
        assertEquals(6.0f, cafe.preco());
    }

    @Test
    void RetornaNomeCafeExpresso(){

        Cafe cafe = new Expresso();
        assertEquals("Café Expresso",cafe.nome());
    }
    @Test
    void RetornaPrecoCafeAmericano(){

        Cafe cafe = new CafeAmericano();
        assertEquals(2.10f, cafe.preco());
    }

    @Test
    void RetornaNomeCafeAmericano(){

        Cafe cafe = new CafeAmericano();
        assertEquals("Café Americano",cafe.nome());
    }

    @Test
    void RetornaPrecoCafeComLeite(){

        Cafe cafe = null;
        cafe = new Leite(cafe);

        assertEquals(3.00f,cafe.preco());
    }
    @Test
    void RetornaNomeCafeComLeite(){
        Cafe cafe = null;
        cafe = new Leite(cafe);
        assertEquals("Café com Leite",cafe.nome());
    }

    @Test
    void RetornaPrecoCafeComChocolate(){

        Cafe cafe = null;
        cafe = new Chocolate(cafe);
        assertEquals(6.0f,cafe.preco());
    }

    @Test
    void RetornaNomeCafeComChocolate(){
        Cafe cafe = null;
        cafe = new Chocolate(cafe);
        assertEquals("Café com Chocolate", cafe.nome());
    }

}