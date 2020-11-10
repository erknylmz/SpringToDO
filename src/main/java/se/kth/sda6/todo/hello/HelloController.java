package se.kth.sda6.todo.hello;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }
    @RequestMapping("/hello-person/{name}")
    public String helloPerson(@PathVariable String name) {
        return "hello " + name;
    }
    @RequestMapping("/hello-person-age")
    public String helloPersonAge (@RequestParam String name, @RequestParam Integer age) {
        return "hello " + name +" your age is " + age;
    }
}
