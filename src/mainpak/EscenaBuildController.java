package mainpak;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.image.ImageView;

import javafx.scene.image.Image;
import javafx.scene.text.TextFlow;

public class EscenaBuildController implements Initializable {

    @FXML
    private ImageView imageView0,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private ArrayList<String> objetos= new ArrayList<String>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private Label obj,campeon;

    @FXML
    private TextField numero1, numero2,numero21;

    @FXML
    protected void operar(ActionEvent event)throws FileNotFoundException {
        String champ=numero1.getText();
        Image image = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\champion\\"+champ+".png"));
        Image image2 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\"+objetos.get(0)+".png"));
        Image image3 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\"+objetos.get(1)+".png"));
        Image image4 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\"+objetos.get(2)+".png"));
        Image image5 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\"+objetos.get(3)+".png"));
        Image image6 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\"+objetos.get(4)+".png"));
        Image image7 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\"+objetos.get(5)+".png"));
        imageView0.setImage(image);
        imageView1.setImage(image2);
        imageView2.setImage(image3);
        imageView3.setImage(image4);
        imageView4.setImage(image5);
        imageView5.setImage(image6);
        imageView6.setImage(image7);



    }
    @FXML
    protected void añadir(ActionEvent event) {
        String objeto=numero2.getText();
        String text="";
        if(objetos.size()<6){
            objetos.add(objeto);
        }
        for (int i=0;i<objetos.size();i++){
            text=text+","+objetos.get(i);
        }
        obj.setText(text);

    } @FXML
    protected void quitar(ActionEvent event) {
        int numero=Integer.parseInt(numero21.getText())-1;
        objetos.remove(numero);

    }

}
