package ru.vampa.zkTable.model;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zul.AbstractListModel;
import ru.vampa.zkTable.db.DBService;
import ru.vampa.zkTable.db.entity.Procedure;

import java.util.List;

public class ProcedureListModel extends AbstractListModel<String> {
	private List<Procedure> procedures;

	@Init
	public void init() {
		procedures = DBService.INSTANCE.procedureDao().getProcedures();
	}

	public List<Procedure> getProcedures() {
		return procedures;
	}

    @Override
    public String getElementAt(int i) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
