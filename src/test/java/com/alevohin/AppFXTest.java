package com.alevohin;

import com.alevohin.AppFX;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

/**
 * Tests for {@link AppFX}.
 *
 * @author Yuriy Alevohin (alevohin@mail.ru)
 * @version $Id$
 * @since 0.8
 */
public final class AppFXTest extends ApplicationTest {

    @Override
    public void start(final Stage stage) throws Exception {
        new AppFX().start(stage);
    }

    @Test
    public void showsButtons() throws Exception {
        MatcherAssert.assertThat(
            lookup(".button").queryAll().size(),
            Matchers.is(2)
        );
    }

    @Test
    public void showsBottom() throws Exception {
        final Label lifeness = lookup("BOTTOM").queryFirst();
        MatcherAssert.assertThat(
            lifeness.isVisible(),
            Matchers.is(true)
        );
    }

    @Test
    public void clicksButtons() throws Exception {
        clickOn("A").clickOn("B");
    }
}
