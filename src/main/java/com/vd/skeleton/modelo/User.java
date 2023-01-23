package com.vd.skeleton.modelo;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity @Table(name = "usuarios")
@Data
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3 , max = 10 , message = "nombre no puede ser menor a 3")
    private String nombre;
    private String email;
    private String clave;
}
