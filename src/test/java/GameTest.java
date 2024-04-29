import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void createGame() {
        assertNotNull(game);
    }

    @Test
    void argumentNullHandleTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess(null);
        });
    }

    @Test
    void argumentLengthHandleTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess("13");
        });
    }

    @Test
    void argumentNumberValidTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess("12s");
        });
    }

    @Test
    void argumentDuplicatedNumberTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess("122");
        });
    }

    @Test
    void returnSolvedCaseTest(){
        String question = "124";
        game.setQuestion(question);

        String guessNumber = "124";
        GameResult result = game.guess(guessNumber);

        assertEquals(result.isSovled(), true);
        assertEquals(result.getStrikes(), 3);
        assertEquals(result.getBalls(), 0);
    }

    @Test
    void _1Ball_0Strike(){
        String question = "124";
        game.setQuestion(question);

        String guessNumber = "351";
        GameResult result = game.guess(guessNumber);

        assertEquals(result.isSovled(), false);
        assertEquals(result.getStrikes(), 0);
        assertEquals(result.getBalls(), 1);
    }

    @Test
    void _1Ball_1Strike(){
        String question = "124";
        game.setQuestion(question);

        String guessNumber = "192";
        GameResult result = game.guess(guessNumber);

        assertEquals(result.isSovled(), false);
        assertEquals(result.getStrikes(), 1);
        assertEquals(result.getBalls(), 1);
    }



    @Test
    void _2Ball_0Strike(){
        String question = "124";
        game.setQuestion(question);

        String guessNumber = "142";
        GameResult result = game.guess(guessNumber);

        assertEquals(result.isSovled(), false);
        assertEquals(result.getStrikes(), 1);
        assertEquals(result.getBalls(), 2);
    }

    @Test
    void _2Ball_1Strike(){
        String question = "124";
        game.setQuestion(question);

        String guessNumber = "421";
        GameResult result = game.guess(guessNumber);

        assertEquals(result.isSovled(), false);
        assertEquals(result.getStrikes(), 1);
        assertEquals(result.getBalls(), 2);
    }

    @Test
    void _3Ball_0Strike(){
        String question = "124";
        game.setQuestion(question);

        String guessNumber = "412";
        GameResult result = game.guess(guessNumber);

        assertEquals(result.isSovled(), false);
        assertEquals(result.getStrikes(), 0);
        assertEquals(result.getBalls(), 3);
    }


}