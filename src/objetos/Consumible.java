/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Arrays;

public class Consumible extends Objeto {

    private int stacks;

    public Consumible() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Consumible(StatsObjeto stats, String id, String name, String description, String plaintext, int stacks, String[] from,
            String[] into, String[] tags, int depth, Oro gold) {
        super(stats, id, name, description, plaintext, from, into, tags, depth, gold);
        this.stacks = stacks;
    }

    @Override
    public String toString() {
        return "Consumible [stacks=" + stacks + ", stats=" + stats + ", id=" + id + ", name=" + name + ", description="
                + description + ", plaintext=" + plaintext + ", from=" + Arrays.toString(from) + ", into="
                + Arrays.toString(into) + ", tags=" + Arrays.toString(tags) + ", depth=" + depth + ", gold=" + gold
                + "]";
    }
}
