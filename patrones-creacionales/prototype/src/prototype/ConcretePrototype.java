/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author germa
 */
public class  ConcretePrototype extends AbstractPrototype{
    
    public ConcretePrototype(String data) {
        super(data);
    }

    @Override
    public AbstractPrototype clone() {
        return new ConcretePrototype(this.data);
    }
}