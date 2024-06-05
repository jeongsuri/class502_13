package member.services;

import global.exceptions.ValidationException;
import global.validators.Validator;
import member.controllers.RequestJoin;
import member.validators.JoinVaildator;


public class JoinService {

    private Validator<RequestJoin> validator = new JoinVaildator();

    public JoinService(Validator<RequestJoin> validator){
        this.validator = validator;
    }

    public void process(RequestJoin form){
        validator.check(form);
    }
}
