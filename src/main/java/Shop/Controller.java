package Shop;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

public class Controller {
    @FXML
    private ImageView image;

    @FXML
    public void initialize(){
        image.setImage(new Image("/your_image.png"));

    }




}
