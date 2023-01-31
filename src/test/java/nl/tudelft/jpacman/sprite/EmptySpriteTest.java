package nl.tudelft.jpacman.sprite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test suite to confirm that {@link nl.tudelft.jpacman.sprite.EmptySprite} methods are functioning correctly.
 *
 * @author Benjamin Weber
 *
 */
public class EmptySpriteTest {

    /**
     * The enmptySprite under test.
     */
    private EmptySprite emptySprite;

    /**
     * Creates an enmptySprite to test on.
     */
    @BeforeEach
    void setUp()
    {
        emptySprite = new EmptySprite();
    }

    /**
     * Asserts that an enmptySprite properly returns its width.
     */
    @Test
    void split()
    {
        assertThat(emptySprite.split(0, 0, 1, 1) instanceof EmptySprite);
    }
}

