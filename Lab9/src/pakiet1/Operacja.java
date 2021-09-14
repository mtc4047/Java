
package pakiet1;

import java.util.Date;
import java.math.BigDecimal;
public class Operacja {
    private Date dataOperacji;
    private BigDecimal kwotaOperacji;

    public Operacja() {
    }
    
    public Date getDataOperacji() {
        return dataOperacji;
    }

    public void setDataOperacji(Date dataOperacji) {
        this.dataOperacji = dataOperacji;
    }

    public BigDecimal getKwotaOperacji() {
        return kwotaOperacji;
    }

    public void setKwotaOperacji(BigDecimal kwotaOperacji) {
        this.kwotaOperacji = kwotaOperacji;
    }
    
}