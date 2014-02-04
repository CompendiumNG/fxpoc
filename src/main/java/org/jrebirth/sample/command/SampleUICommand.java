package org.jrebirth.sample.command;

import javafx.scene.SceneBuilder;
import javafx.scene.control.LabelBuilder;
import javafx.stage.Stage;
import javafx.stage.StageBuilder;
import javafx.stage.StageStyle;

import org.jrebirth.core.command.DefaultUIBeanCommand;
import org.jrebirth.core.wave.Wave;
import org.jrebirth.core.wave.WaveBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class <strong>SampleUICommand</strong> use to update the user interface.
 * 
 * @author
 */
public final class SampleUICommand extends DefaultUIBeanCommand<WaveBean> {

    /** The class logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleUICommand.class);

    /**
     * {@inheritDoc}
     */
    public void initCommand() {
        // You must put your initialization code here (if any)
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void execute(final Wave wave) {

        LOGGER.info("Display a pop up from JAT");

        final Stage s = StageBuilder.create()
                .title("Sample Ui Command Test")
                .style(StageStyle.DECORATED)
                .scene(SceneBuilder.create()
                        .root(LabelBuilder.create().text("Run into JAT").build())
                        .build())

                .build();

        s.show();
        // Sample for popup => Attach owner !!!
        // getLocalFacade().getGlobalFacade().getApplication().getStage()
    }

}
