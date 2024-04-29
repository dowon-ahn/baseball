import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}