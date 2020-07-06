package it.arsinfo.ga.ui.cantiere;

import com.vaadin.ui.Grid;

import it.arsinfo.ga.model.entity.Cantiere;
import it.arsinfo.ga.vaadin.CustomGrid;

public class CantiereGrid extends CustomGrid<Cantiere> {

    public CantiereGrid(String gridName) {
        super(new Grid<>(Cantiere.class),gridName);
        setColumns("identificativo","statoCantiere");
        setColumnCaption("statoCantiere","Stato");
    }

}
