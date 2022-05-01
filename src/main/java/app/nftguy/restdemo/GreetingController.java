package app.nftguy.restdemo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin(origins = "*")
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World")String name){
        return new Greeting(
                counter.incrementAndGet(),
                String.format(template, name)
        );
    }

    @PostMapping("/greeting")
    public Greeting greeting(@RequestBody Greeting response){
        return response;
    }
}
