package table;

import java.util.ArrayList;
import java.util.List;

import datamodel.UserCredentials;

public class UserCredentialsTable  extends AbstractTable<UserCredentials> {

    private List<UserCredentials> rows;

    @Override
    public List<UserCredentials> getRows() {
        if (rows == null) {
            rows = new ArrayList<UserCredentials>();
        }
        return rows;
    }

    @Override
    public void setRows(List<UserCredentials> rows) {
        this.rows = rows;
    }
}
