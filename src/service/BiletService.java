package service;

import AllDB.Database;
import entity.Bilet;
import entity.BiletSinifi;
import repository.BiletRepository;

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
        if (existsById(biletId) && existsByMusteriIdInMusteri(musteriId)){
            musteriBiletService.save(id,musteriId,biletId);
            return "bilet satın alındı...";
        }
        return "bilet alınamadı... bilet veya musteri bulunamadı";
    }

    public boolean existsById(int id) {
        for (Bilet b : biletRepository.getAll()) {
            if (b.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean existsByMusteriIdInMusteri(int id){
        boolean isMusteri=musteriService.existsById(id);
        return isMusteri;
    }


}
