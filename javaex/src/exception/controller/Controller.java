package exception.controller;

import exception.CheckedException;
import exception.service.Service;

public class Controller {
    Service service = new Service();

    public int add(String str){
        return service.save(str);
    }
}
