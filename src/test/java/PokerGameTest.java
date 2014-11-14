
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rrh.katas.pokerkata.PokerGame;


/**
 * Created by rroldan on 18/10/14.
 */
public class PokerGameTest {

    PokerGame pokerGame;

    @Before
    public void setUp() {
     pokerGame = new PokerGame();

    }


    @Test
    public void testNingunaGanadora(){
        String cartas = "2,♠:3,♥:4,♦:5,♣";
        String combiancionGanadora = pokerGame.play(cartas);
        Assert.assertEquals("Esperaba una combinación no ganadora",null,combiancionGanadora);
    }

    @Test
    public void testOnePair() {
        String cartas = "2,♠:2,♥:4,♦:5,♣";
        String combiancionGanadora = pokerGame.play(cartas);
        Assert.assertEquals("Esperaba una combinación ganadora del tipo Pareja","ONE PAIR",combiancionGanadora);
    }

}
