package eu.meisterlich.mypetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"/owners", "owners", "/owners.html"})
    public String getOwners() {
        return "owners";
    }
}
