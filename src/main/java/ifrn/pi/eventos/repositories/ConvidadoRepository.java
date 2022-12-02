package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{

	List<Convidado> findByEvento(Evento evento);
}
