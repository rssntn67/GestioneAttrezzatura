package it.arsinfo.ga.service;

import java.util.List;

import org.springframework.stereotype.Service;

import it.arsinfo.ga.model.data.Anno;
import it.arsinfo.ga.model.data.Fornitore;
import it.arsinfo.ga.model.data.MarcaConsumabile;
import it.arsinfo.ga.model.data.TipoConsumabile;
import it.arsinfo.ga.model.entity.ModelloConsumabile;

@Service
public interface ModelloConsumabileService extends EntityBaseService<ModelloConsumabile>{

	List<ModelloConsumabile> searchBy(Fornitore fornitore, Anno searchAnnoProduzione, String searchNome, TipoConsumabile searchTipoModello,
			MarcaConsumabile searchMarcaModello);

}
