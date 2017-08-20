package by.alekskvetko.heroku_test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


@Controller
public class Home {
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name, Model model) {
            model.addAttribute("name",name);
            model.addAttribute("time",getCurrentTime());
        return "response";
    }
    @RequestMapping(value = "/ade16154-1608-4e6d-8de1-704413619d93", method = RequestMethod.GET)
    public String secret(Model model) {
        String secret = System.getenv("secret");
        if (StringUtils.isEmpty(secret)) {
            model.addAttribute("message", "There is no secret message...");
        } else {
            model.addAttribute("message", secret);
        }
        return "response";
    }



    private String getCurrentTime() {
        ZoneId zoneId = ZoneId.of("UTC+3");
        LocalDateTime time = LocalDateTime.now(zoneId);
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
