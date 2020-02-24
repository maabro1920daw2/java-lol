/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Arrays;

public class Ataque extends Objeto {

    public Ataque() {
        super();
    }

    public Ataque(StatsObjeto stats, String id, String name, String description, String plaintext, String[] from,
            String[] into, String[] tags, int depth, Oro gold) {
        super(stats, id, name, description, plaintext, from, into, tags, depth, gold);
    }
    
    @Override
    public String toString() {
        return "Ataque [stats=" + stats + ", id=" + id + ", name=" + name + ", description=" + description
                + ", plaintext=" + plaintext + ", from=" + Arrays.toString(from) + ", into=" + Arrays.toString(into)
                + ", tags=" + Arrays.toString(tags) + ", depth=" + depth + ", gold=" + gold.getBase() + "]";
    }

    public StatsObjeto getStats() {
        return stats;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public String[] getFrom() {
        return from;
    }

    public String[] getInto() {
        return into;
    }

    public String[] getTags() {
        return tags;
    }

    public int getDepth() {
        return depth;
    }

    public Oro getGold() {
        return gold;
    }
}
