
package com.SistemaBarberia.Barberia.models.services;

import com.SistemaBarberia.Barberia.models.dao.IPersonasDao;
import com.SistemaBarberia.Barberia.models.entities.Personas;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasServiceImpl implements IPersonasService{
    
    @Autowired
    private IPersonasDao personasDao;
    
    @Override
    @Transactional()
    public List<Personas> findAll() {
       return (List<Personas>) personasDao.findAll();
    }

    @Override
    public void save(Personas personas) {
       personasDao.save(personas);
    }

    @Override
    public Personas findOne(Long dui) {
        return personasDao.findById(dui).orElse(null);
    }

    @Override
    public void delete(Long dui) {
        personasDao.deleteById(dui);
    }
    
}
