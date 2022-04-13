package personal.restapiclass.repository;

import org.springframework.data.repository.CrudRepository;
import personal.restapiclass.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
