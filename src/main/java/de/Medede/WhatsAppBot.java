package de.Medede;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class WhatsAppBot {
    // Twilio Account SID and Auth Token
    public static final String ACCOUNT_SID = "armandbiham@web.de";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        sendWhatsAppMessage("whatsapp:+14155238886", "whatsapp:+4917640579225", "Hello from your Java WhatsApp Bot!");
    }

    public static void sendWhatsAppMessage(String from, String to, String messageBody) {
        Message message = Message.creator(
                        new PhoneNumber(to),
                        new PhoneNumber(from),
                        messageBody)
                .create();

        System.out.println("Message sent successfully! SID: " + message.getSid());
    }
}

