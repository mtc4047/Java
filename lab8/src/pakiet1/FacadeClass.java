/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakiet1;

import java.util.ArrayList;

/**
 *
 * @author Filip
 */
public class FacadeClass {
    private DaneDAO daneDao;
    private DaneFormatowanie daneFormatowanie;

    public FacadeClass(DaneDAO daneDao, DaneFormatowanie daneFormatowanie) {
        this.daneDao = daneDao;
        this.daneFormatowanie = daneFormatowanie;
    }
    public void pokazDane(){
        ArrayList listaDanych=daneDao.wczytajDane();
        daneFormatowanie.formatujDane(listaDanych);
        daneFormatowanie.wyswietlDane();
    }

    public DaneDAO getDaneDao() {
        return daneDao;
    }

    public void setDaneDao(DaneDAO daneDao) {
        this.daneDao = daneDao;
    }

    public DaneFormatowanie getDaneFormatowanie() {
        return daneFormatowanie;
    }

    public void setDaneFormatowanie(DaneFormatowanie daneFormatowanie) {
        this.daneFormatowanie = daneFormatowanie;
    }
    
}
