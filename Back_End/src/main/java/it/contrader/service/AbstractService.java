package it.contrader.service; 
 
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
 
import it.contrader.dao.MyRepository; 
public abstract class AbstractService<Entity,DTO> implements ServiceDTO<Entity,DTO> {
	
	@Autowired
	protected MyRepository<Entity,Long> myRepository;
	@Autowired 
	protected ModelMapper mapper;

	@Override
	public void delete(long id) {
		myRepository.deleteById(id);
	}
}