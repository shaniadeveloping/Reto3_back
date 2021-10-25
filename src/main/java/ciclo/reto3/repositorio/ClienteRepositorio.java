package ciclo.reto3.repositorio;

import ciclo.reto3.inter.InterfaceCliente;
import ciclo.reto3.modelo.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClienteRepositorio {
    @Autowired
    private InterfaceCliente crud1;


    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll();
    }

    public Optional <Cliente> getCliente(int id){
        return crud1.findById(id);
    }

    public Cliente save(Cliente cliente){
        return crud1.save(cliente);
    }
    public void delete(Cliente cliente){
        crud1.delete(cliente);
    }
}
