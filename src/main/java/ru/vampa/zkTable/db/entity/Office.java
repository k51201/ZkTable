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
@Table(name = "offices")
public class Office implements Serializable {
    private static final long serialVersionUID = -6225019503572343245L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;
}
