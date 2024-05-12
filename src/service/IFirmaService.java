package service;

import entity.Firma;

import java.util.List;

public interface IFirmaService {
    // C.R.U.D.
    // create
    // read
    // update
    // delete

    public void save(Firma firma);

    public List<Firma> getAll();
    public List<Firma> getUcakSayisibesOlanFirmalar();

    public Firma idyeGoreFirmaGetir(int id) ;
}
