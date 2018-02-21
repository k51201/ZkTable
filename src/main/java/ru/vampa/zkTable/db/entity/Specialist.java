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
@Table(name = "specialists")
public class Specialist implements Serializable {
    private static final long serialVersionUID = -7345697712835845366L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "lastname", length = 64, nullable = false)
    private String lastname;

    @Column(name = "firstname", length = 64, nullable = false)
    private String firstname;

    @Column(name = "middlename", length = 64)
    private String middlename;

    public String getFio() {
        return lastname + " " + firstname +
                (middlename != null ? " " + middlename : "");
    }
}
