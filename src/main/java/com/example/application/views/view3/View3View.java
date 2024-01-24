package com.example.application.views.view3;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("View3")
@Route(value = "my-view3", layout = MainLayout.class)
@RolesAllowed("USER")
@Uses(Icon.class)
public class View3View extends Composite<VerticalLayout> {

    public View3View() {
        getContent().setHeightFull();
        getContent().setWidthFull();
    }
}
