package de.Medede;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/whatsapp")
    public void receiveMessage(@RequestParam("From") String from, @RequestParam("Body") String body) {
        System.out.println("Received message from " + from + ": " + body);

        // Antwort zurücksenden
        String responseMessage = "You said: " + body;
        WhatsAppBot.sendWhatsAppMessage("whatsapp:+14155238886", from, responseMessage);
    }
}

