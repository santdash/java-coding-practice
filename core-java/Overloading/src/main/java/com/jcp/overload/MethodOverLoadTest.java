package com.jcp.overload;

/** Demonstrates how overloading works for same type of the object.
 */
public class MethodOverLoadTest {

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Tiger tiger1 = new Tiger();
        BengalTiger bt = new BengalTiger();

        MethodOverLoadTest mot = new MethodOverLoadTest();
        mot.eats(tiger); // Executes animal eat
        mot.eats(tiger1); // Executes tiger eat
        mot.eats(bt); // Executes tiger eat
    }

    public void eats(Animal animal){
        System.out.println("Executing Animal eat");
        animal.eat();
    }

    public void eats(Tiger tiger){
        System.out.println("Executing Tiger eat");
        tiger.eat();
    }
}
