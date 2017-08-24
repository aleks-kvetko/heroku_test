package by.alekskvetko.heroku_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;


@Controller
public class Home {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model, HttpServletRequest request) {
        String referrer = request.getHeader("referer");
        model.addAttribute("referrer", referrer);
        return "response";
    }
}
