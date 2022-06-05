package app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundController {
    // == GET mappings ==
    @GetMapping("/home")
    public String getFund(){
        return "home is here";
    }
}
