package org.ensaj.voiture.Controller;

import org.ensaj.voiture.Model.Voiture;
import org.ensaj.voiture.Repository.VoitureRepository;
import org.ensaj.voiture.Service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class VoitureController {
    @Autowired
    VoitureRepository voitureRepository;

    @Autowired
    VoitureService voitureService;

    @GetMapping(value ="/voitures", produces = {"application/json"})
    public ResponseEntity<List<Voiture>> chercherVoiture(){
        return ResponseEntity.ok(voitureRepository.findAll());
    }

    @GetMapping("/voitures/{Id}")
    public Voiture chercherUneVoiture(@PathVariable Long Id) throws Exception{
        return voitureRepository.findById(Id).orElseThrow(() -> new Exception("Voiture Introuvable"));
    }
    @PostMapping("/voitures")
    public Voiture enregistrerUneVoiture(@RequestBody Voiture voiture){
        return voitureService.enregistrerVoiture(voiture);
    }
}
