package ru.gb.jseminar;

import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private String brand;
    private int RAM;
    private int SSD;
    private String OS;
    private String graphicCard;
    private int price;

    public Notebook(String brand, int ram, int ssd, String os, String graphicCard, int price) {
        this.brand = brand;
        this.RAM = ram;
        this.SSD = ssd;
        this.OS = os;
        this.graphicCard = graphicCard;
        this.price = price;
    }

    public Map<String, String> mainFeatures() {
        Map<String, String> params = new HashMap<>();

        params.put("Brand", brand);
        params.put("RAM", String.valueOf(RAM));
        params.put("SSD", String.valueOf(SSD));
        params.put("OS", OS);
        params.put("Graphic Card", graphicCard);
        params.put("price", String.valueOf(price));

        return params;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void GraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s, RAM: %d GB, SSD: %d GB, OS: %s, Graphic Card: %s, Price: %d $",
                brand, RAM, SSD, OS, graphicCard, price);
    }

}