package campeones;

import java.util.ArrayList;
import java.util.Scanner;

public class Campeon implements Comparable<Campeon> {

    private int key;
    private String id, name, title, compare;
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

    public Campeon buscarCampeon(ArrayList<Campeon> c, String cs) {
        boolean good = false;
        Campeon cB = new Campeon();
        for (Campeon cn : c) {
            if (cn.getName().equalsIgnoreCase(cs)) {
                cB = cn;
                good = true;
                break;
            }
        }
        if (!good) {
            System.out.println("Campeon no encontrado.");
        }
        return cB;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nTitulo: " + title + "\nVida: " + stats.getHp() + "\nMana: " + stats.getMp();
    }

    @Override
    public int compareTo(Campeon c) {
        switch (this.compare) {
            case "hp":
                if (this.stats.getHp() > c.getStats().getHp()) {
                    return 1;
                } else if (this.stats.getHp() < c.getStats().getHp()) {
                    return -1;
                } else {
                    return 0;
                }
            case "ataque":
                if (this.stats.getAttackdamage() > c.getStats().getAttackdamage()) {
                    return 1;
                } else if (this.stats.getAttackdamage() < c.getStats().getAttackdamage()) {
                    return -1;
                } else {
                    return 0;
                }
            case "armor":
                if (this.stats.getArmor() > c.getStats().getArmor()) {
                    return 1;
                } else if (this.stats.getAttackdamage() < c.getStats().getArmor()) {
                    return -1;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
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

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

}
