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

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX Application.
 *
 * @author Felipe Pina (felipe.pina@protonmail.com)
 * @version $Id$
 * @since 0.8
 */
public final class AppFX extends Application {

    /**
     * Program entry point.
     * @param args Program arguments.
     */
    public static void main(final String... args) {
        Application.launch(AppFX.class, args);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        stage.setTitle("TEST");
        final Scene scene = new Scene(this.centralPane());
        scene.getStylesheets().add(
            AppFX.class.getResource("App.css").toExternalForm()
        );
        stage.setScene(scene);
        stage.setMinWidth(800.0D);
        stage.setMinHeight(600.0D);
        stage.show();
    }

    private Pane centralPane() {
        final BorderPane border = new BorderPane();
        border.setTop(this.buttonsPane());
        border.setCenter(this.centerPane());
        border.setBottom(this.bottomPane());
        return border;
    }

    private Pane buttonsPane() {
        final HBox controls = new HBox();
        controls.setSpacing(5.0D);
        controls.setAlignment(Pos.BASELINE_CENTER);
        controls.getChildren().add(new Label("BUTTONS"));
        controls.getChildren().add(new Button("A"));
        controls.getChildren().add(new Button("B"));
        return controls;
    }

    private Pane centerPane() {
        final VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().add(new Label("CENTER"));
        pane.setMinSize(600.0D, 400.0D);
        return pane;
    }

    private Pane bottomPane() {
        final VBox bottom = new VBox();
        final HBox status = new HBox();
        status.setAlignment(Pos.BASELINE_RIGHT);
        bottom.getChildren().add(status);
        status.getChildren().add(new Label("BOTTOM"));
        return bottom;
    }

}
