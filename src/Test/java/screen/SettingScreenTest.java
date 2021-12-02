package screen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




import engine.*;


class SettingScreenTest {

    Frame frame = new Frame(448, 520);
    Screen screen = new Screen(frame.getWidth(), frame.getHeight(), 60);
    SettingScreen sc = new SettingScreen(screen.width, screen.height, screen.fps);

    @Test
    void testReturnCode() {
        assertEquals(2, sc.returnCode);
    }
}