package ra.generic;

import java.util.List;

public interface IApplication <T>{
    List<T> read();
    void insert(T t);
    void update(T t);
    void delete(T t);
}
