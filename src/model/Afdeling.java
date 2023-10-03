package model;

/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * Purpose of the program
 */
public class Afdeling {
    private static final String DEFAULT_AFDELINGS_NAAM = "Onbekend";
    private static final String DEFAULT_AFDELINGS_PLAATS = "Onbekend";

    private final String afdelingsNaam;
    private final String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }

    public Afdeling() {
        this(DEFAULT_AFDELINGS_NAAM, DEFAULT_AFDELINGS_PLAATS);
    }

    @Override
    public String toString() {
        return String.format("afdeling %s te %s", this.afdelingsNaam, this.afdelingsPlaats);
    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }
}