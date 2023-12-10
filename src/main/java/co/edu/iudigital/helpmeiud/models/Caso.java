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
@Table(name = "casos")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Caso implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column( name = "nombre", nullable = false,  length = 130)
    String nombre;

    @Column( name = "delitos",  length = 130)
    String delitos;


}
