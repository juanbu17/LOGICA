package co.com.cesde.minimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saludar")
public class SpringAppController {
    @GetMapping("/Hola")
    public String printGreeting(){

        String name = "El Mejor Market De La City";
        return "Hello World 🌎  " + name;
    }
}
