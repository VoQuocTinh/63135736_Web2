package ThiGK.ntu63135736.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Maincontroller {
    @GetMapping({"/", "/home"})
	    public String index() {
	        return "index";
	    }
}
