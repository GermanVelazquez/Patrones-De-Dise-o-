/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author germa
 */
public abstract class AbstractPrototype {
    protected String data;

    public AbstractPrototype(String data) {
        this.data = data;
    }

    public abstract AbstractPrototype clone();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}