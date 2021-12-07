package screen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import engine.*;
import static org.junit.jupiter.api.Assertions.*;
class SettingScreenTest {

   Frame frame;
   Screen screen;
   SettingScreen sc;

    @BeforeEach
    void setUp() {
        int width = 448;
        int height = 520;
        int fps = 60;


        frame = new Frame(width, height);
        screen = new Screen(frame.getWidth(), frame.getHeight(), fps);
        sc = new SettingScreen(screen.width, screen.height, screen.fps);
    }


    @Test
    void run() {
        assertEquals(2, sc.returnCode);
    }

}