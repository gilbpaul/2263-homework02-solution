/**
 * This class tests the 2263-homework02-solution App class.
 *
 * @author Paul Gilbreath
 */

package edu.isu.cs.cs2263.hw02;

import edu.isu.cs.cs2263.hw02.data.Course;
import edu.isu.cs.cs2263.hw02.views.*;
import edu.isu.cs.cs2263.hw02.App;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxToolkit;
import org.testfx.api.FxRobot;
import org.testfx.util.WaitForAsyncUtils;
//import org.testfx.framework.junit5;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;
import org.junit.jupiter.api.DisplayName;
import java.util.concurrent.TimeoutException;
import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.*;
import javafx.scene.control.Labeled;
import javafx.scene.input.MouseButton;

//import testFXJunit.TestFXJUnitAppRunner;

/*import javafx.stage.Stage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.Start;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;


import org.testfx.api.FxToolkit;
import java.util.concurrent.TimeoutException;
import org.testfx.util.WaitForAsyncUtils;*/

@ExtendWith(ApplicationExtension.class)
class AppTest {

    /*private final String LABEL_FOR_BUTTON = ".button";
    private final String DISPLAY_LABEL = "Display (dept.)";


    @BeforeEach
    void runAppToTests() {
        FxToolkit.registerPrimaryStage();
        //FxToolkit.setupApplication(App.class);
        //System.out.println();
        FxToolkit.setupApplication(App::new);
        FxToolkit.showStage();
        WaitForAsyncUtils.waitForFxEvents(100);
    }

    @AfterEach
    void stopApp() throws TimeoutException {
        FxToolkit.cleanupStages();
    }

    void start(Stage primaryStage){
        primaryStage.toFront();
    }

    @Test
    @DisplayName("test App Start")
    void testStart() {
        Labeled display_label = lookup(LABEL_FOR_BUTTON).query();
        FxAssert.verifyThat(display_label, LabeledMatchers.hasText(DISPLAY_LABEL));
    }*/

    /*@Start
    void onStart(Stage stage) throws TimeoutException{
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(App::new);
        //WaitForAsyncUtils.waitForFxEvents(100);
        stage.show();
    }

    @Test
    void test_should_contain_first_button() {
        // expect:
        verifyThat("#displayButton", hasText("Display (dept.)"));
    }*/

}
