package usuarios;

public enum Elo {

    HIERRO("Hierro", 9), BRONCE("Bronce", 8), PLATA("Plata", 7), ORO("Oro", 6), PLATINO("Platino", 5), DIAMANTE("Diamante", 4), MASTER("Master", 3), GRANDMASTER("GrandMaster", 2), CHALLENGER("Challenge", 1);

    private String nombreLiga;
    private int posicion;

    private Elo(String nombreLiga, int posicion) {
        this.nombreLiga = nombreLiga;
        this.posicion = posicion;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public int getPosicion() {
        return posicion;
    }

    public static Elo getHIERRO() {
        return HIERRO;
    }

    public static Elo getBRONCE() {
        return BRONCE;
    }

    public static Elo getPLATA() {
        return PLATA;
    }

    public static Elo getORO() {
        return ORO;
    }

    public static Elo getPLATINO() {
        return PLATINO;
    }

    public static Elo getDIAMANTE() {
        return DIAMANTE;
    }

    public static Elo getMASTER() {
        return MASTER;
    }

    public static Elo getGRANDMASTER() {
        return GRANDMASTER;
    }

    public static Elo getCHALLENGER() {
        return CHALLENGER;
    }
}
