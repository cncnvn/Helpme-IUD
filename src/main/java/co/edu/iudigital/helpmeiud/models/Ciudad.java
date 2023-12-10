package co.edu.iudigital.helpmeiud.models;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ciudad")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", nullable = false,  length = 140)
    String nombre;
    @Column(name = "descripcion",  length = 140)
    String descripcion;
}
