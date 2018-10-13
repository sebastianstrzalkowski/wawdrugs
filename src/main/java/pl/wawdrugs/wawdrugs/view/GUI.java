package pl.wawdrugs.wawdrugs.view;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
public class GUI  extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupMainLayout();
    }

    private void setupMainLayout() {
    }
}
