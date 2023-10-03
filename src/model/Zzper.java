package model;

/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * Purpose of the program
 */
public class Zzper extends Persoon implements Oproepbaar {
    private static final int DEFAULT_UREN_GEWERKT = 0;

    private final double uurTarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurTarief) {
        super(naam, woonplaats, afdeling);
        this.uurTarief = uurTarief;
        this.urenGewerkt = DEFAULT_UREN_GEWERKT;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt += uren;
    }

    @Override
    public double berekenJaarinkomen() {
        return uurTarief * urenGewerkt;
    }

    @Override
    public String toString() {
        return String.format("%s en is een zzp-er met een uurtarief van %.2f", super.toString(), this.uurTarief);
    }
}