package service;

import model.FormYt;

import java.util.List;

public interface FormYtService {
    public List<FormYt> showList();
    void addNewForm(FormYt formYt);
}
