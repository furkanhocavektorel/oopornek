package controller;

import entity.Firma;
import entity.Ucak;
import service.IUcakService;
import service.UcakService;

import java.util.List;

public class UcakController {
    private IUcakService IucakService;
    public UcakController(){
        IucakService= new UcakService();
    }

    public List<Ucak> findAll(){
        return IucakService.getAll();
    }

    public void save(int id, String ad, int kapasite, Firma firma){
        IucakService.save(id,ad,kapasite,firma);
    }
}
