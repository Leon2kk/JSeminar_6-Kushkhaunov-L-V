package ru.gb.jseminar;

import ru.gb.jseminar.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
    // поля и методы. Реализовать в java.
    // 2) Создать множество ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
    // и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
    // по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();

        List<Notebook> notebooks = hw.filter(hw.createNotebook(), hw.initListNotebooks());
        Logger log = Logger.getLogger(Homework.class.getName());
        for (Notebook notebook : notebooks) {
            log.info(notebook.toString());
        }

    }

    public Map<String, String> createNotebook() {

        Map<String, String> searchInfo = new HashMap<>();
        searchInfo.put("RAM", "16");
        searchInfo.put("SSD", "512");
        searchInfo.put("OS", "Linux (AstraLinux 8.5)");
        searchInfo.put("Graphic Card", "Intel 730");

        return searchInfo;

    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Acer", 4, 128, "Windows 10 Pro", "Intel 630", 700));
        notebooks.add(new Notebook("HP", 16, 512, "Linux (AstraLinux 8.5)", "Intel 730", 840));
        notebooks.add(new Notebook("Apple", 32, 512, "MacOS X", "ARM A10", 2900));
        
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> filter = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            Map<String, String> notebookFeatures = notebook.mainFeatures();
            // System.out.println(notebookFeatures);
            boolean flag = true;

            for (String features : params.keySet()) {
                if (notebookFeatures.containsKey(features)) {
                    if (!params.get(features).equals(notebookFeatures.get(features))) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                filter.add(notebook);
            }
        }

        return filter;
    }

}
