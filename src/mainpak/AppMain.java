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
public class AppMain extends Application {

    public static void main(String[] args) {
        ArrayList<Campeon> cn = new ArrayList<Campeon>();
        Campeon cp = new Campeon();
        Gson gson = new Gson();
        try (Reader reader = new FileReader("C:\\Users\\marco\\Documents\\NetBeansProjects\\M03UF5_PROYECTO\\assets\\json\\data.json")) {
            Campeon[] object = gson.fromJson(reader, Campeon[].class);			
            int n = 0;
            double vida = 0;
            double resultado = 0;
            String nombre ="";
            while(n < object.length) {
                vida += object[n].getStats().getHp();
		//System.out.println("Nombre: "+object[n].getName()+" Vida: "+object[n].getStats().getHp());
                Campeon c = new Campeon(object[n].getKey(),object[n].getId(),object[n].getName(),object[n].getTitle(),object[n].getStats());
                cn.add(c);
		n++;
            }
            
            //System.out.println("Total: "+cn.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        cp.buscarCampeon(cn);
        
        
        //launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EscenaInicio.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        //stage.show();
    }
    
}
