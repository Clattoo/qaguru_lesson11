package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    @Tag("property")
    void browserChooserTest() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // mozilla
        // gradle property_test
        // mozilla

        // gradle property_test -Dbrowser=opera
    }

    @Test
    @Tag("property")
    void browserScreenResolutionTest() {
        String resolution = System.getProperty("resolution", "1920x1080");

        System.out.println(resolution);
    }
}
