package dataModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Marcin
 * Date: 20.05.13
 * Time: 22:39
 * To change this template use File | Settings | File Templates.
 */
public class Zamowienie {

    private Odbiorca odbiorca;

    private BigDecimal wartoscCalkowita;

    private Date terminPlatnosci;

    public Zamowienie() {
    }

    public Odbiorca getOdbiorca() {
        return odbiorca;
    }

    public void setOdbiorca(Odbiorca odbiorca) {
        this.odbiorca = odbiorca;
    }

    public BigDecimal getWartoscCalkowita() {
        return wartoscCalkowita;
    }

    public void setWartoscCalkowita(BigDecimal wartoscCalkowita) {
        this.wartoscCalkowita = wartoscCalkowita;
    }

    public Date getTerminPlatnosci() {
        return terminPlatnosci;
    }

    public void setTerminPlatnosci(Date terminPlatnosci) {
        this.terminPlatnosci = terminPlatnosci;
    }
}
