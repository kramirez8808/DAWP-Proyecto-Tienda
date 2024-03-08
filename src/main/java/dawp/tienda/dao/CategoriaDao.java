package dawp.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import dawp.tienda.domain.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    
}
