package dataModel;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Marcin
 * Date: 20.05.13
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class Faktura {
    private Date dataWystawienia;
    private Date terminPlatnosci;

    public Faktura() {
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public Date getTerminPlatnosci() {
        return terminPlatnosci;
    }

    public void setTerminPlatnosci(Date terminPlatnosci) {
        this.terminPlatnosci = terminPlatnosci;
    }
}
