package Domain.dao;

import Domain.model.UserModel;
import Domain.exception.UsetNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private long nextId = 1L;
    private List<UserModel> models = new ArrayList<>();

    public UserModel save (final UserModel model){
            model.setId(nextId++);
            models.add(model);
            return model;
    }

    public UserModel update(final UserModel model){
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public UserModel findById(final long id){
        var message = String.format("Nao existe usuario com o id %s cadastrado");
       return  models.stream()
                 .filter(u->
                         u.getId() == id)
                 .findFirst()
                 .orElseThrow(
                 ()-> new UsetNotFoundException(message)
         );
    }

    public void delete ( final long id){
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public List<UserModel> findAll(){
        return models;
    }

}
