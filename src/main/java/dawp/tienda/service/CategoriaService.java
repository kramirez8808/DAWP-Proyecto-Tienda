
package dawp.tienda.service;

import java.util.List;
import dawp.tienda.domain.Categoria;

public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activos);
    
}
