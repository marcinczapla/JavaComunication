package dataModel;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Marcin
 * Date: 20.05.13
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class PozycjaZamowienia {
    private String nazwaTowaru;
    private int iloscZamowiona;
    private BigDecimal wartosc;

    public PozycjaZamowienia() {
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getIloscZamowiona() {
        return iloscZamowiona;
    }

    public void setIloscZamowiona(int iloscZamowiona) {
        this.iloscZamowiona = iloscZamowiona;
    }

    public BigDecimal getWartosc() {
        return wartosc;
    }

    public void setWartosc(BigDecimal wartosc) {
        this.wartosc = wartosc;
    }
}
