package pe.edu.upc.marcelo.service.inter;

import java.util.List;

import pe.edu.upc.marcelo.models.entity.Instrument;

public interface IInstrumentService extends IService<Instrument> {
	
	List<Instrument> findInstrumentByName(String term);
}
