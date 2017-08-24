package by.alekskvetko.heroku_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


@Controller
public class Home {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model, HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        String headerName;
        List<String> headers = new ArrayList<>();
        while (headerNames.hasMoreElements()) {
            headerName = headerNames.nextElement();
            headers.add(headerName + " : " + request.getHeader(headerName));
        }
        model.addAttribute("headers", headers);
        return "response";
    }
}
