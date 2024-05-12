package service.Impl;

import entity.Bilet;
import entity.BiletSinifi;
import repository.BiletRepository;
import service.IBiletService;
import service.IMusteriBiletService;
import service.IMusteriService;
import service.IUcakService;

public class BiletService implements IBiletService {
    private BiletRepository biletRepository;
    private IUcakService ucakService;
    private IMusteriService musteriService;
    private IMusteriBiletService musteriBiletService;

    public BiletService() {
        this.biletRepository = new BiletRepository();
        this.ucakService = new UcakService();
        this.musteriService = new MusteriService();
        this.musteriBiletService= new MusteriBiletService();
    }

    @Override
    public String save(int id, String barkod, int fiyat, int ucakId, int koltukNo, BiletSinifi biletSinifi) {
        // bilet repoya gitmeden önce ucak var mı diye kontrol edilmeli
        boolean isUcak = ucakService.existById(ucakId);
        if (isUcak) {
            biletRepository.save(id, barkod, fiyat, ucakId, koltukNo, biletSinifi);
            return "bilet kayıt edildi";
        } else {
            return "bilet kayıt edilemedi";
        }
    }

    @Override
    public String satinAl(int id, int biletId, int musteriId) {
        if (existsById(biletId) && musteriService.existsById(musteriId)){
            musteriBiletService.save(id,musteriId,biletId);
            return "bilet satın alındı...";
        }
        return "bilet alınamadı... bilet veya musteri bulunamadı";
    }

    @Override
    public void biletSil(int id) {

        // genec

    }

    public boolean existsById(int id) {
        for (Bilet b : biletRepository.getAll()) {
            if (b.getId() == id) {
                return true;

            }
        }
        return false;
    }

    public void updateBilet(int id,int biletFiyat){

    }


}
