package com.cydeo.tasks;

public interface UnaryPredicate<T> {
    public boolean test(T obj);
}
/*
Purpose of this UnaryPredicate interface is to provide you one abstract method which is
    public boolean test(T obj)
So with that what is coming to my mind is - I know what it needs to be done, but I don't know HOW it's
going to be done. So interface has method called test method, it gets objects and return boolean value,
but question is based on what? So we don't know we need to put implementation for that which is the
purpose of interface.
 */