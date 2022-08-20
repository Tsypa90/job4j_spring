package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Pavel");
        ui.add("Andrey");
        StartUI newUi = context.getBean(StartUI.class);
        newUi.add("NewPavel");
        newUi.print();
    }
}
