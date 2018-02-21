package ru.vampa.zkTable.db;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ru.vampa.zkTable.db.entity.Procedure;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * @author Vladimir Belyashov
 * @since 19.02.2018
 */
public class ProcedureDao {
    private Session session;

    ProcedureDao(Session session) {
        this.session = session;
    }

    public List<Procedure> getProcedures() {
        final Transaction transaction = session.beginTransaction();
        final CriteriaQuery<Procedure> query = session.getCriteriaBuilder().createQuery(Procedure.class);
        query.select(query.from(Procedure.class));
        final List<Procedure> list = session.createQuery(query).list();
        transaction.commit();

        return list;
    }
}
