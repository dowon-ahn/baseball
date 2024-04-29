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
        Game game = new Game();
        assertNotNull(game);
    }
    @Test
    void argumentNullHandleTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess(null);
        });
    }
}