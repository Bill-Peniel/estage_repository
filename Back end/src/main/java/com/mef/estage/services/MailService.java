package com.mef.estage.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private final JavaMailSender javaMailSender;
    private final String defaultFrontendUrl;

    public MailService(JavaMailSender javaMailSender, @Value("${application.fontend.default-url}") String defaultFrontendUrl) {
        this.javaMailSender = javaMailSender;
        this.defaultFrontendUrl = defaultFrontendUrl;
    }

    public void sendForgotMessage(String email, String token , String baseUrl){
        var url = baseUrl!=null ? baseUrl: defaultFrontendUrl;

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("deenous@finances.bj");
        message.setTo(email);
        message.setSubject("Reset your Password");
        message.setText(String.format("Click <a href=\"%s/reset/%s\">here</a> to reset your password.",url,token));

        javaMailSender.send(message);
    }

    public void sendConfirmDemandeMessage(String email, String token , String baseUrl, String numDemande){
        var url = baseUrl!=null ? baseUrl: defaultFrontendUrl;

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("deenous@finances.bj");
        message.setTo(email);
        message.setSubject("Confirmation de Demande de Stage");
        message.setText(String.format("Votre Demande numéro :"+numDemande+" a été bien e,registrée avec succès",url,token));

        javaMailSender.send(message);
    }

}
