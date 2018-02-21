package ru.vampa.zkTable.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Vladimir Belyashov
 * @since 19.02.2018
 */
@Data
@Entity
@Table(name = "procedures")
public class Procedure implements Serializable {
    private static final long serialVersionUID = 3042431781957091211L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", length = 64, nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specialist", referencedColumnName = "id")
    private Specialist specialist;

    @Column(name = "price", length = 64)
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reception", referencedColumnName = "id")
    private Reception reception;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "office", referencedColumnName = "id")
    private Office office;
}
