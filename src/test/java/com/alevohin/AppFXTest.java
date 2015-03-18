/**
 * Copyright (c) 2014-2015, Vaporsens
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are NOT permitted.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
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
