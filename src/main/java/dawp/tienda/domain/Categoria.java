
package dawp.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Campo Auto-Incremental
    @Column(name = "id_categoria")
    private Long idCategoria; //Hibernate lo transforma/MySQL => id_categoria PK
    private String descripcion; //MySQL => descripcion
    private String rutaImagen; //MySQL => ruta_imagen
    private boolean activo; //MySQL => activo

    //Constructores
    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
