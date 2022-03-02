package service;

import model.Mail;

import java.util.ArrayList;
import java.util.List;

public class MailServiceImpl implements MailService {
    private static List<Mail> mailList;

    static {
//       private String language;
//    private Integer paperSize;
//    private String spam;
//    private String signature;
        mailList = new ArrayList<>();
        mailList.add(new Mail("English", 10, "Enable spam filter", "Hung Son"));
    }

    @Override
    public List<Mail> showList() {
        return mailList;
    }

    @Override
    public void addNewForm(Mail mail) {
        mailList.add(mail);
    }
}
