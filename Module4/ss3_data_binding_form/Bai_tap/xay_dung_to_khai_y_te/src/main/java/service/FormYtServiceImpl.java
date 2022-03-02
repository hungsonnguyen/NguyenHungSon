package service;

import model.FormYt;

import java.util.ArrayList;
import java.util.List;

public class FormYtServiceImpl implements FormYtService {
    List<FormYt> formYtList = new ArrayList<>();

    @Override
    public List<FormYt> showList() {
        return formYtList;
    }

    @Override
    public void addNewForm(FormYt formYt) {
        formYtList.add(formYt);
    }
}
