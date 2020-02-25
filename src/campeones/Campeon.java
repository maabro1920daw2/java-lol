package campeones;

import java.util.ArrayList;
import java.util.Scanner;

public class Campeon {

    private int key;
    private String id, name, title;
    private StatsCampeon stats;

    public Campeon() {
    }

    public Campeon(int key, String id, String name, String title, StatsCampeon stats) {
        super();
        this.key = key;
        this.id = id;
        this.name = name;
        this.title = title;
        this.stats = stats;
    }
    
    public void buscarCampeon(ArrayList<Campeon> c) {
        boolean good = false;
        System.out.println("Introduce el nombre del campeon: ");
        Scanner ent = new Scanner(System.in);
        String cs = ent.next();
        for (Campeon cn : c) {
            if (cn.getName().equalsIgnoreCase(cs)) {
                System.out.println(cn.toString());
                good = true;
                break;
            }
        }
        if (!good) {
            System.out.println("Campeon no encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: "+name+"\nTitulo: "+title+"\nVida: "+stats.getHp()+"\nMana: "+stats.getMp();
    }
    
    

    public int getKey() {
        return key;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StatsCampeon getStats() {
        return stats;
    }

    public void setStats(StatsCampeon stats) {
        this.stats = stats;
    }
}
