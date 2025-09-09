package com.SENA.FlightManagementSystem.Security.Controller;

import com.SENA.FlightManagementSystem.Security.Entity.UserAccount;
import com.SENA.FlightManagementSystem.Security.IService.IUserAccountService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/UserAccount")
public class UserAccountController extends ASecurityBaseController<UserAccount, IUserAccountService> {

    public UserAccountController(IUserAccountService service) {
        super(service, "UserAccount");
    }
}
