package co.edu.iudigital.helpmeiud.models;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Usuario  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column( name = "nombre", nullable = false,  length = 100)
    String nombre;

    @Column(
            name = "apellido",  length = 100)
    String apellido;

    @Column(name = "email")
    String email;


    @Column(name = "password")
    String password;

    @Column(name = "fecha_nacimiento")
        LocalDate fechaNacimento;

    @Column
    Boolean enabled;

    @Column
    String image;

    @Column(name = "red_social")
    Boolean redSocial;
}
