package org.jrebirth.sample;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.jrebirth.core.application.DefaultApplication;
import org.jrebirth.core.resource.font.FontItem;
import org.jrebirth.core.ui.Model;
import org.jrebirth.sample.resources.SampleFonts;
import org.jrebirth.sample.resources.SampleStyles;
import org.jrebirth.sample.ui.SampleModel;

import java.util.Arrays;
import java.util.List;

/**
 * The class <strong>SampleApplication</strong>.
 * 
 * @author
 */
public final class SampleApplication extends DefaultApplication<StackPane> {

    /**
     * Application launcher.
     * 
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        preloadAndLaunch(args);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends Model> getFirstModelClass() {
        return SampleModel.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeStage(final Stage stage) {
        stage.setFullScreen(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeScene(final Scene scene) {
        addCSS(scene, SampleStyles.MAIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<FontItem> getFontToPreload() {
        return Arrays.asList(new FontItem[] {
                SampleFonts.SPLASH,
        });
    }

}
