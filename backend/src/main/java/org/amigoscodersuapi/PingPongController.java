package org.amigoscodersuapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {
    record PingPong(String result, String message) {}

    @GetMapping("/ping")
    public PingPong getPingPong(){
        return new PingPong("Pong","You just got ponged you know. Ponged so hard Like so hard! The Pongiest. So pongy");
        // cp,,efa
    }
}
