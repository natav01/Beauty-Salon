package ua.training.controller.model.mapper;

import java.util.List;




public interface GenericDao<T> extends AutoCloseable {
    void create (T entity);
    T findById(int id);
    List<T> findAll();
  //  void update(Optional<User> user);
    void delete(String login);
    void close();
}
