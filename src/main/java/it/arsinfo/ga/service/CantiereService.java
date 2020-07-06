package it.arsinfo.ga.service;

import java.util.List;

import it.arsinfo.ga.model.data.StatoCantiere;
import it.arsinfo.ga.model.entity.Cantiere;

public interface CantiereService extends EntityBaseService<Cantiere>{

	List<Cantiere> searchBy(String searchIdentificativo, StatoCantiere statoCantiere);

}