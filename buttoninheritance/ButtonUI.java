package buttoninheritance;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;

public class ButtonUI extends JButton {

    public ButtonUI(String text) {
        super(text);
        setPreferredSize(new Dimension(150, 100));
        this.setForeground(Color.BLACK);
    }

    public void openBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
}
