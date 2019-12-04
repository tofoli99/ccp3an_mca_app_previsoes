package br.usjt.hellospringboot.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

import br.usjt.hellospringboot.model.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	@Async
	public Future<List<Cidade>> findByNome (String nome);

	public Cidade findByOneLatitudeAndLongitude (Double latitude, Double longitude); 

	@Query("SELECT * FROM Cidade c WHERE c.nome = :nome")
	public Cidade findByNomee (String nome);

	@Query("SELECT * FROM Cidade c WHERE c.nome LIKE ?%")
	public List<Cidade> findByNomeIgnoreCase (String nome);


}
