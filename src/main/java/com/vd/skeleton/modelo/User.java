package com.vd.skeleton.modelo;

import lombok.*;

import javax.persistence.*;

@Entity @Table(name = "usuarios")
@Data
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String email;
    private String clave;
}
