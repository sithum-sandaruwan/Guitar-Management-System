package edu.icet.guitarmanage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "guitar")
public class GuitarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String number;
    private String brand;
    private Integer qty;
    private String type;
}
