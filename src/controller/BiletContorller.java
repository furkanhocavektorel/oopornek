package controller;

import entity.BiletSinifi;
import service.Impl.BiletService;
import service.IBiletService;

public class BiletContorller {
    private IBiletService biletService;
    public BiletContorller(){
        biletService= new BiletService();
    }

    public String save(int id, String barkod, int fiyat, int ucakId, int koltukNo, BiletSinifi biletSinifi){
        return biletService.save(id,barkod,fiyat,ucakId,koltukNo,biletSinifi);
    }


    public String satinAl(int id,int biletId,int musteriId){
        return biletService.satinAl(id,biletId,musteriId);
    }


}
