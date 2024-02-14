
package dawp.tienda.impl;

import dawp.tienda.dao.CategoriaDao;
import dawp.tienda.domain.Categoria;
import dawp.tienda.service.CategoriaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();

        if (activos) {
            // Remover los elementos que no estén activos
            lista.removeIf(c -> !c.isActivo());
        }

        return lista;
    }
    
}
