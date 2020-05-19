package com.training.oop;

public class B extends A {
   private static final String a = "A";
   public B() {
       super(method());
   }

   private static String method() {
       return "A";
   }
}
