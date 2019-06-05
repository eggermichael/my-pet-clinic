package eu.meisterlich.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(path = {"", "/", "index", "index.html", "index.htm"})
    public String getIndex() {
        return "index";
    }
}
