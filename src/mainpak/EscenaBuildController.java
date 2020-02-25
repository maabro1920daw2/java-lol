package mainpak;

import campeones.Campeon;
import com.google.gson.Gson;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.scene.image.ImageView;

import javafx.scene.image.Image;
import javafx.scene.text.TextFlow;
import objetos.Ataque;
import objetos.Consumible;
import objetos.Defensa;

public class EscenaBuildController implements Initializable {

    private ArrayList<Campeon> cn = new ArrayList<>();
    private Map<String, Ataque> ma = new TreeMap<>();
    private Map<String, Defensa> md = new TreeMap<>();
    private Map<String, Consumible> mc = new TreeMap<>();

    @FXML
    private ImageView imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;
    private ArrayList<String> objetos = new ArrayList<String>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Gson gson = new Gson();
        try (Reader champFile = new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\json\\data.json")) {
            Campeon[] object = gson.fromJson(champFile, Campeon[].class);
            int n = 0;
            while (n < object.length) {
                Campeon c = new Campeon(object[n].getKey(), object[n].getId(), object[n].getName(), object[n].getTitle(), object[n].getStats());
                cn.add(c);
                n++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader atqFile = new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\json\\attack.json")) {
            Ataque[] atq = gson.fromJson(atqFile, Ataque[].class);
            int m = 0;
            while (m < atq.length) {
                Ataque a = new Ataque(atq[m].getStats(), atq[m].getId(), atq[m].getName(), atq[m].getDescription(), atq[m].getPlaintext(), atq[m].getFrom(), atq[m].getInto(), atq[m].getTags(), atq[m].getDepth(), atq[m].getGold());
                ma.put(atq[m].getId(), a);
                m++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader defFile = new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\json\\defense.json")) {
            Defensa[] def = gson.fromJson(defFile, Defensa[].class);
            int m = 0;
            while (m < def.length) {
                Defensa d = new Defensa(def[m].getStats(), def[m].getId(), def[m].getName(), def[m].getDescription(), def[m].getPlaintext(), def[m].getFrom(), def[m].getInto(), def[m].getTags(), def[m].getDepth(), def[m].getGold());
                md.put(def[m].getId(), d);
                m++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader conFile = new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\json\\consume.json")) {
            Consumible[] con = gson.fromJson(conFile, Consumible[].class);
            int m = 0;
            while (m < con.length) {
                Consumible co = new Consumible(con[m].getStats(), con[m].getId(), con[m].getName(), con[m].getDescription(), con[m].getPlaintext(), con[m].getStacks(), con[m].getFrom(), con[m].getInto(), con[m].getTags(), con[m].getDepth(), con[m].getGold());
                mc.put(con[m].getId(), co);
                m++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Label obj, campeon;

    @FXML
    private TextField txtCampeon, txtObAgregar, txtObQuitar;

    @FXML
    protected void operar(ActionEvent event) throws FileNotFoundException {
        String champ = txtCampeon.getText();
        Image image = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\champion\\" + champ + ".png"));
        Image image2 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\" + objetos.get(0) + ".png"));
        Image image3 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\" + objetos.get(1) + ".png"));
        Image image4 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\" + objetos.get(2) + ".png"));
        Image image5 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\" + objetos.get(3) + ".png"));
        Image image6 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\" + objetos.get(4) + ".png"));
        Image image7 = new Image(new FileInputStream("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\img\\item\\" + objetos.get(5) + ".png"));
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
        String nombreObjeto = txtObAgregar.getText();
        String text = "";
        if (objetos.size() < 6) {
            objetos.add(nombreObjeto);
            
            
        }
        for (int i = 0; i < objetos.size(); i++) {
            text = text + "," + objetos.get(i);
        }
        obj.setText(text);

    }

    @FXML
    protected void quitar(ActionEvent event) {
        int numero = Integer.parseInt(txtObQuitar.getText()) - 1;
        objetos.remove(numero);

    }

}
