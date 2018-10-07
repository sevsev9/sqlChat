package main;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Main_ctr implements Initializable {

    public Button button_send;
    public CheckBox anonymous;
    public TextArea text_send;
    public TableView user_table;
    public TextArea text_left;
    public TextArea text_right;
    public ImageView profile_img;
    public TextField profile_newpasswd;
    public TextField update_password;
    public Label label_msgcnt;
    public ListView latest_messages;
    public Label label_regdate;
    public Label label_lvl;
    public RadioButton profile_gender_m;
    public RadioButton profile_gender_f;
    public ProgressBar xpbar;
    public TextField profile_fname;
    public TextField profile_lname;
    public TextField profile_email;
    public TextField profile_confnew;

    public void sendAction(ActionEvent actionEvent) {

    }

    public void updateInfo(ActionEvent actionEvent) {

    }

    public void m_checkAction(ActionEvent actionEvent) {

    }

    public void f_checkAction(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
