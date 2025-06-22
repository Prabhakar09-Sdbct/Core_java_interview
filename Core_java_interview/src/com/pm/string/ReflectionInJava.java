package com.pm.string;

public class ReflectionInJava {

	public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.pm.string.L_ReflectionInJava");
            ReflectionInJava reflection = (ReflectionInJava) clazz.getDeclaredConstructor().newInstance();
            reflection.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
