import javax.imageio.*;
import java.awt.*;
import java.io.*;

public class Resources {
    Image img;

    public Resources() throws Exception {
        img = ImageIO.read(Resources.class.getResourceAsStream("/images/placeholder.png"));
        if (img == null) {
            img = ImageIO.read(new File(System.getProperty("user.dir") + "/resources/images/placeholder.png"));
        }
    }


    public Image getImg() {
        return img;
    }
}
