package co.com.cesde.minimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class SpringAppController {
  @GetMapping ("/hola")
    public String printGreeting(){
        String name = "Spring BOOT";
        return "Hello Word, I`m JuanB, this is my first code whit "+name;

    }

}
