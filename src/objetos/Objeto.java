/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import campeones.StatsCampeon;

public abstract class Objeto {

    protected StatsObjeto stats;
    protected String id, name, description, plaintext;
    protected String[] from, into, tags;
    protected int depth;
    protected Oro gold;

    public Objeto() {
    }

    public Objeto(StatsObjeto stats, String id, String name, String description, String plaintext, String[] from,
            String[] into, String[] tags, int depth, Oro gold) {
        super();
        this.stats = stats;
        this.id = id;
        this.name = name;
        this.description = description;
        this.plaintext = plaintext;
        this.from = from;
        this.into = into;
        this.tags = tags;
        this.depth = depth;
        this.gold = gold;
    }

}
