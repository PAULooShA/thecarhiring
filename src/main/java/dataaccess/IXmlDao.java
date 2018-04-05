package dataaccess;

import java.util.List;

public interface IXmlDao<E> {

    void saveNew(E entity);

    E get(Long id);

    List<E> getAll();

    void delete(Long id);
}
