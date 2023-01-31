package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test suite to confirm that {@link Player}s correctly start alive.
 *
 * @author Benjamin Weber
 *
 */
public class PlayerAliveTest {

    /**
     * The player under test.
     */
    private Player player;

    /**
     * Creates a player character to test on.
     */
    @BeforeEach
    void setUp()
    {
        PlayerFactory playerFactory = new PlayerFactory(new PacManSprites());
        player = playerFactory.createPacMan();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void isAlive() {
        // Remove the following placeholder:
        assertThat(player.isAlive());
    }
}
