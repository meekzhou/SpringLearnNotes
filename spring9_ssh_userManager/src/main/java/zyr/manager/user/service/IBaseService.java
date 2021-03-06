package zyr.manager.user.service;

import java.util.List;
import java.util.Objects;

/**
 * Created by zhouweitao on 2016/11/15.
 */
public interface IBaseService<T> {
    void add(T t);

    void del(int id);

    void update(T t);

    T findOne(int id);

    List<T> findAll();

    List<T> list(String hql, Objects... obj);
}
