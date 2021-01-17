package com.LMira.exercicioProposto.servicies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LMira.exercicioProposto.dto.ClientDTO;
import com.LMira.exercicioProposto.entities.Client;
import com.LMira.exercicioProposto.repositories.ClientRepository;




@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(x -> new ClientDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.get();
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client(dto);
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO update(Long id,ClientDTO dto) {
		
			Client entity = new Client(dto);
			entity.setId(repository.getOne(id).getId());
			entity = repository.save(entity);
			return new ClientDTO(entity);
		
	}
	
	public void delete(Long id) {
		
			repository.deleteById(id);
		
	}
}
