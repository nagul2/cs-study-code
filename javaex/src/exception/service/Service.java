package exception.service;

import exception.CheckedException;
import exception.repository.Repository;

public class Service {
    Repository repository = new Repository();

    public int save(String str) {
        return repository.exceptionSave(str);
    }

}
