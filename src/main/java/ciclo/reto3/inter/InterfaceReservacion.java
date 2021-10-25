package ciclo.reto3.inter;

import ciclo.reto3.modelo.Reservacion;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservacion extends CrudRepository<Reservacion,Integer>{

}