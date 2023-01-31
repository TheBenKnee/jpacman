package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test suite to confirm that {@link nl.tudelft.jpacman.level.MapParser} methods are functioning correctly.
 *
 * @author Benjamin Weber
 *
 */
public class MapParserTest {

    /**
     * The MapParser under test.
     */
    private MapParser mapParser;

    /**
     * Creates a MapParser to test on.
     */
    @BeforeEach
    void setUp()
    {
        PacManSprites pmSprites = new PacManSprites();
        mapParser = new MapParser(
            new LevelFactory(pmSprites, new GhostFactory(pmSprites), new DefaultPointCalculator()),
            new BoardFactory(pmSprites)
        );
    }

    /**
     * Asserts that an parseMap properly creates a level (determined if the player position is registered).
     */
    @Test
    void parseMap()
    {
        Level newLevel = mapParser.parseMap(Lists.newArrayList("#P#"," # ", "###"));
        assertThat(newLevel.isAnyPlayerAlive());
    }
}
