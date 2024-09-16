package shoes;

import design.console.Design;

public class Shoes {
    private final String producer;
    private final int size;
    private final String color;
    public Shoes()
    {
        this.producer = "???";
        this.size = 0;
        this.color = "???";
    }
    public Shoes(String producer, int size, String color)
    {
        this.producer = producer;
        this.size = size;
        this.color = color;
    }
    public Shoes(int size, String color)
    {
        this.producer = "???";
        this.size = size;
        this.color = color;
    }
    public String getProducer(){
        return this.producer;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
    public String getBrand()
    {
        return this.producer;
    }
}
