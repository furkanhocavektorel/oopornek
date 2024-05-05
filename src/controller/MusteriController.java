package controller;

import service.IMusteriService;
import service.MusteriService;

public class MusteriController {
    public IMusteriService service;
    public MusteriController(){
        service= new MusteriService();
    }

    public void save (int id,String ad, String soyad, String tel){
        service.save(id,ad,soyad,tel);
    }

}
