package mainpak;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.google.gson.*;

import campeones.Campeon;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import objetos.Ataque;
import objetos.Consumible;
import objetos.Defensa;
import usuarios.Elo;
import usuarios.Usuario;

public class AppMain extends Application {

    public static void main(String[] args) {
        /*Gson gson = new Gson();
        ArrayList<Campeon> cn = new ArrayList<>();
        Map<String, Ataque> ma = new TreeMap<>();
        Map<String, Defensa> md = new TreeMap<>();
        Map<String, Consumible> mc = new TreeMap<>();
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
        } */      
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EscenaLista.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

}
