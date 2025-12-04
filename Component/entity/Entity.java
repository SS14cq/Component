package entity;

import java.util.HashMap;
import java.util.Map;

import components.IComponent;

public class Entity {
    private Map<Class<? extends IComponent>, IComponent>components= new HashMap<>();

    public void addComponent(IComponent component){
        components.put(component.getClass(), component);
    }

}
