package HomeWork06;


import java.util.HashMap;
import java.util.Map;

public class Notebook {
    String color;
    String model;


    public Notebook(String color, String model) {
        this.color = color.toLowerCase();
        this.model = model.toLowerCase();

    }

    @Override
    public String toString() {
        return color + ", " + model;
    }

    public  Map<Object,Object> parametrsMap() {
        Map<Object,Object> parametrsNotebook = new HashMap<>();
        parametrsNotebook.put("color", color);
        parametrsNotebook.put("model", model);
        return parametrsNotebook;
    }

}