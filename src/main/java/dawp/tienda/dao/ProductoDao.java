
package dawp.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import dawp.tienda.domain.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
