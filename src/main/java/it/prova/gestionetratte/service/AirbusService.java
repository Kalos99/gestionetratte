package it.prova.gestionetratte.service;

import java.util.List;

import org.springframework.data.domain.Page;

import it.prova.gestionetratte.model.Airbus;

public interface AirbusService {
	
List<Airbus> listAllElements();
	
	List<Airbus> listAllElementsEager();

	Airbus caricaSingolo(Long id);
	
	Airbus caricaSingoloConTratte(Long id);

	Airbus aggiorna(Airbus airbusInstance);

	Airbus inserisciNuovo(Airbus airbusInstance);

	void rimuovi(Airbus airbusInstance);
	
	public Page<Airbus> findByExample(Airbus example, Integer pageNo, Integer pageSize, String sortBy);

}
