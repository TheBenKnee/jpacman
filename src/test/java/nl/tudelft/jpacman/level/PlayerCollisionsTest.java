package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test suite to confirm that {@link nl.tudelft.jpacman.level.PlayerCollisions} methods are functioning correctly.
 *
 * @author Benjamin Weber
 *
 */
public class PlayerCollisionsTest {

    /**
     * The playerCollision under test.
     */
    private PlayerCollisions playerCollisions;

    /**
     * Creates an playerCollision to test on.
     */
    @BeforeEach
    void setUp()
    {
        playerCollisions = new PlayerCollisions(new DefaultPointCalculator());
    }

    /**
     * Asserts that an playerCollision properly kills a player when playerVersusGhost triggered.
     */
    @Test
    void playerVersusGhost()
    {
        Player player = new PlayerFactory(new PacManSprites()).createPacMan();
        playerCollisions.playerVersusGhost(player, new GhostFactory(new PacManSprites()).createBlinky());
        assertThat(!player.isAlive());
    }
}
