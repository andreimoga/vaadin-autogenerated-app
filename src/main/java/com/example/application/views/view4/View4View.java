package com.example.application.views.view4;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("View4")
@Route(value = "my-view4", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class View4View extends Composite<VerticalLayout> {

    public View4View() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
