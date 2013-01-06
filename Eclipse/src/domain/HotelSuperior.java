package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name=HotelSuperior.TAULA)
@Table(name=HotelSuperior.TAULA)
public class HotelSuperior extends Hotel {
	public static final String TAULA = "HOTELSUPERIOR";
	
    @Column(name="recarrec")
	private float recarrec;
    
    @Override
    public Float obteVariacioPreu() {
    	return recarrec;
    }
}
