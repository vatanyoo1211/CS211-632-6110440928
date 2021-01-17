package Shop.controllers;

import com.github.saacsos.FXRouter;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;

public class controller {


    @FXML
    public void handleUseBackButton(ActionEvent actionEvent) {
        try {
            FXRouter.goTo("home");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า home ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }

    }




}
