package ciclo.reto3.inter;

import ciclo.reto3.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{

}