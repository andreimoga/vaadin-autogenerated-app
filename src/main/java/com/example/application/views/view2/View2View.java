package com.example.application.views.view2;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@PageTitle("View2")
@Route(value = "my-view2", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class View2View extends Composite<VerticalLayout> {

    public View2View() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
