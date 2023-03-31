package hu.javauniversity.myapp2023.DAL;

import org.springframework.data.repository.CrudRepository;

import hu.javauniversity.myapp2023.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
