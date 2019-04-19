
package com.SistemaBarberia.Barberia.models.dao;
import com.SistemaBarberia.Barberia.models.entities.Personas;
import org.springframework.data.repository.CrudRepository;

public interface  IPersonasDao extends CrudRepository <Personas, Long >{
    
}
