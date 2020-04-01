package springBoot; 
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@RestController
@EnableAutoConfiguration
public class FrescoCourseController {
    @RequestMapping("/fresco")
    public String test() {
        return "Hi! Welcome to Fresco World";
    }