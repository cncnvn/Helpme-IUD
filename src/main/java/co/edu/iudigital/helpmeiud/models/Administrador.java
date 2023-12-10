package co.edu.iudigital.helpmeiud.models;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

// debe quedar importaciòn  por importaciòn
@Getter
@Setter
@Entity
@Table(name = "administrador")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Administrador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column( name = "nombre", nullable = false,  length = 120)
    String nombre;

    @Column( name = "email")
    String email;

    @Column( name = "password")
    String password;

}
