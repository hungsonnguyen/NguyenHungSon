package model;

import org.springframework.stereotype.Service;

@Service
public class Mail {
    private String language;
    private Integer paperSize;
    private String spam;
    private String signature;

    public Mail(String language, int paperSize, String spam, String signature) {
        this.language = language;
        this.paperSize = paperSize;
        this.spam = spam;
        this.signature = signature;
    }

    public Mail() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(Integer paperSize) {
        this.paperSize = paperSize;
    }

    public String getSpam() {
        return spam;
    }

    public void setSpam(String spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
