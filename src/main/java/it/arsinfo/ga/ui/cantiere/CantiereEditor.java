package it.arsinfo.ga.ui.cantiere;

import java.util.EnumSet;

import com.vaadin.data.Binder;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import it.arsinfo.ga.dao.CantiereServiceDao;
import it.arsinfo.ga.data.StatoCantiere;
import it.arsinfo.ga.entity.Cantiere;
import it.arsinfo.ga.vaadin.EntityEditor;

public class CantiereEditor extends EntityEditor<Cantiere> {

    private final ComboBox<StatoCantiere> statoCantiere = new ComboBox<StatoCantiere>("Stato",
                                                                           EnumSet.allOf(StatoCantiere.class));
    private final TextField identificativo = new TextField("Identificativo");
 
    public CantiereEditor(CantiereServiceDao dao) {
        super(dao, new Binder<>(Cantiere.class));

        HorizontalLayout intestazioni = new HorizontalLayout(identificativo,statoCantiere);
        
        setComponents(getActions(), intestazioni);


        getBinder().forField(identificativo).asRequired();
        getBinder().forField(statoCantiere).asRequired();
        getBinder().bindInstanceFields(this);

        // Configure and style components
        statoCantiere.setEmptySelectionAllowed(false);
        statoCantiere.setVisible(false);
        
    }

    @Override
    public void focus(boolean persisted, Cantiere c) {
        if (persisted) {
        	statoCantiere.setVisible(true);
        	identificativo.setReadOnly(true);
        	statoCantiere.focus();
        } else {
        	statoCantiere.setVisible(false);        	
        	identificativo.setReadOnly(false);
        	identificativo.focus();
        }
    }
}