package domain;


import java.util.Date;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import utility.Pair;

@Entity
@Table(name="VIATGE")
public class Viatge {
	
    @Column(name="dataInici", nullable = false)
	private Date dataInici;
    
    @Column(name="dataFi")
	private Date dataFi;
    
    public Viatge(Client cl, Ciutat c, Date dataIni, Date dataFi) {
    	/* TODO */
    }
    
    public Date getDataFi() {
    	return dataFi;
    }
    
    public String getNomCiutat() {
    	/* TODO */
    	return null;
    }
    
    public Boolean interseccionaPeriode(Date dataIni, Date dataFi) {
        /* TODO */
    	return null;
    }
    
    public HashSet<Pair<String,Float>> getHotelsLliures(Date dataIni, Date DataFi) {
    	/* TODO */
    	return null;
    }
    
    public void afegeixHabitacio(Habitacio h) {
    	/* TODO */	
    }
}