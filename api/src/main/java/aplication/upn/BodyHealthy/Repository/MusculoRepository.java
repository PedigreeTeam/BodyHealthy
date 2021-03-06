package aplication.upn.BodyHealthy.Repository;

import aplication.upn.BodyHealthy.Model.Musculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusculoRepository extends JpaRepository<Musculo, Integer> {

}
