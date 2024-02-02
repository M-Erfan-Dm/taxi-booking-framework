package com.taxi.user.controller;

import com.taxi.user.dto.ExtendedUserSigninDTO;
import com.taxi.user.framework.controller.AbstractAuthController;
import com.taxi.user.service.ExtendedAuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class AuthControllerImplement extends AbstractAuthController<ExtendedUserSigninDTO> {

    @Autowired
    private ExtendedAuthServiceImpl extendedAuthService;

    public AuthControllerImplement(ExtendedAuthServiceImpl extendedAuthService) {
        super(extendedAuthService);
    }
}
