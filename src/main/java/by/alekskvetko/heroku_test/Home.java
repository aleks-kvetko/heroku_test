package by.alekskvetko.heroku_test;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Home {
    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        if (!name.equals("secret")) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String time = sdf.format(new Date());
            return String.format("Hi, %s, current time is %s", name, time);
        } else {
            String secret = System.getenv("secret");
            if (StringUtils.isEmpty(secret)) {
                return "There is no secret message...";
            } else {
                return secret;
            }
        }
    }
}
