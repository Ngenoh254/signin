package com.example.demo.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/registration")
    public String register(@RequestBody RegistrationRequest request) {

        return registrationService.register(request);
    }
    @GetMapping("/confirm")
    public String confirm(@RequestParam("token")String token) {
        return registrationService.confirmToken(token);
    }
}
