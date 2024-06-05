package member.services;

import global.validators.Validator;
import member.controllers.RequestJoin;
import member.validators.JoinValidator;


public class JoinService {

    private Validator<RequestJoin> validator = new JoinValidator();

    public JoinService(Validator<RequestJoin> validator){
        this.validator = validator;
    }

    public void process(RequestJoin form){
        validator.check(form);
    }
}
