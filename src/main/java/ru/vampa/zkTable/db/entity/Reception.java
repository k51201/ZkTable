package ru.vampa.zkTable.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Vladimir Belyashov
 * @since 19.02.2018
 */
@Data
@Entity
@Table(name = "receptions")
public class Reception implements Serializable {
    private static final long serialVersionUID = -7249382344678455699L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "dayofweek", nullable = false)
    private int dayOfWeek;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    public String getTitle() {
        final String dayTime = time.format(DateTimeFormatter.ISO_TIME);
        switch (dayOfWeek) {
            case 0:
                return "понедельник " + dayTime;
            case 1:
                return "вторник " + dayTime;
            case 2:
                return "среда " + dayTime;
            case 3:
                return "четверг " + dayTime;
            case 4:
                return "пятница " + dayTime;
            case 5:
                return "суббота " + dayTime;
            case 6:
                return "воскресение " + dayTime;
        }
        return dayTime;
    }
}
