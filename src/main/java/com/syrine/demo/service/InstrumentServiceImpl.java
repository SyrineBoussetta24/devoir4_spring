package com.syrine.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syrine.demo.entities.Type;
import com.syrine.demo.entities.Instrument;
import com.syrine.demo.repos.InstrumentRepository;

@Service
public class InstrumentServiceImpl implements InstrumentService {

	@Autowired
	InstrumentRepository instrumentRepository;
	
	@Override
	public Instrument saveInstrument(Instrument i) {
		return instrumentRepository.save(i);
		
	}

	@Override
	public Instrument updateInstrument(Instrument i) {
		return instrumentRepository.save(i);
		
	}

	@Override
	public void deleteInstrument(Instrument i) {
		instrumentRepository.delete(i);

	}

   @Override
	public void deleteInstrumentById(Long id) {
	   instrumentRepository.deleteById(id);
		
	}

	@Override
	public Instrument getInstrument(Long id) {
		return  instrumentRepository.findById(id).get();
	
	}

	@Override
	public List<Instrument> getAllInstruments() {
		return instrumentRepository.findAll();
	}
	
    @Override
	public List<Instrument> findByNomInstrument(String nom) {
		return instrumentRepository.findByNomInstrument(nom);
	}

	@Override
	public List<Instrument> findByNomInstrumentContains(String nom) {
		return instrumentRepository.findByNomInstrumentContains(nom);
	}

	@Override
	public List<Instrument> findByNomPrix(String nom, Double prix) {
		return instrumentRepository.findByNomPrix(nom, prix);
	}
	
	@Override
	public List<Instrument> findByType(Type type) {
		return instrumentRepository.findByType(type);
	}

	@Override
	public List<Instrument> findByTypeIdTyp(Long id) {
		return instrumentRepository.findByTypeIdTyp(id);
	}

	@Override
	public List<Instrument> findByOrderByNomInstrumentAsc() {
		return instrumentRepository.findByOrderByNomInstrumentAsc();
	}

	@Override
	public List<Instrument> trierInstrumentsNomsPrix() {
		return instrumentRepository.trierInstrumentsNomsPrix();
	}


}
