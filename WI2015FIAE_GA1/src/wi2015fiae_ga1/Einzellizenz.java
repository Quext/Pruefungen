package wi2015fiae_ga1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w.spiess
 */
public class Einzellizenz extends Artikel{

    public Einzellizenz(int nummer, String bezeichnung, double preis) {
        super(nummer, bezeichnung, preis);
    }
    @Override
    public double getPreis(){        
        return preis * 1.1;
    }

    
    
}
