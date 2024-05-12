package controller;

import entity.Firma;
import service.Impl.FirmaService;
import service.IFirmaService;

import java.util.List;

public class FirmaController {
    //göbekten bağlı
    private IFirmaService firmaService;

    public FirmaController() {
        this.firmaService= new FirmaService();
    }

    public void save(int id, String ad){
        firmaService.save(id,ad);
    }

    public List<Firma> getAll(){
        return firmaService.getAll();
    }
    // id ye göre firma bilgisi getir
    public Firma idyeGoreFirmaDetayi(int id){
        return firmaService.idyeGoreFirmaGetir(id);
    }



}
