package com.company.reflection;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Hello {

    @Test
    public void accessPrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Other obj = new Other();
        Method method = Other.class.getDeclaredMethod("m_pri1");
        // or can do the below
        //Method method1 = obj.getClass().getDeclaredMethod("m_private");
        // method.invoke(obj); // will throw java.lang.IllegalAccessException
        method.setAccessible(true);
        method.invoke(obj);
    }

    @Test
    public void getAllMethods() throws InvocationTargetException, IllegalAccessException {
        Other obj = new Other();
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method m : methods){
            System.out.println("Method: " + m.getName() + " > ");
            //System.out.println("Method: " + m.getName() + " > " + m.canAccess(obj));
        }
    }

    @Test
    public void invokeZeroArgumentMethods() throws InvocationTargetException, IllegalAccessException {
        Other obj = new Other();
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method m : methods){
            /*if(m.canAccess(obj)==false){
                m.setAccessible(true);
            }*/
            if(m.getParameterCount()==0){
                m.invoke(obj);
            }
            //Class<?>[] v = m.getParameterTypes();
            //System.out.println(v.toString());
        }
    }





}
