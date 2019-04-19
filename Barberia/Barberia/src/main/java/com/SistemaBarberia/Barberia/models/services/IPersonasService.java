
package com.SistemaBarberia.Barberia.models.services;
import java.util.List;
import com.SistemaBarberia.Barberia.models.entities.Personas;

public interface IPersonasService {
    public List<Personas> findAll();
    public void save (Personas personas);
    public Personas findOne(Long dui);
    public void delete (Long dui);
    
}
