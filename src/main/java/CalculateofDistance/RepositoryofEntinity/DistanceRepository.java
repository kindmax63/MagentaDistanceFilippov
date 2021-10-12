package CalculateofDistance.RepositoryofEntinity;

import CalculateofDistance.Entinity.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DistanceRepository extends CrudRepository<Distance, Integer> {
    List<Distance> findAllByFromCity(City fromCity);

    List<Distance> findAll();
}
