package com.training.examples;
import com.training.oop.*;
import com.training.order.A;
import com.training.order.B;
import com.training.order.C;
import com.training.oop.Animal;
import com.training.oop.Cat;

import java.lang.*;
import java.security.cert.X509CRLEntry;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

import static java.lang.Byte.*;
import static java.lang.Integer.*;

/**
 * Hello world!
 *
 */
public class App {
    public static  void main(String[] args) {
       int a = App.ifElseExamples(9, 9);
    }
    public static int ifElseExamples(int a, int b) {
    	if (a > b) {
    		return a + b;
    	} else if (a < b) {
    		return a - b;
    	} else {
    		return a / b;
    	}
    }

}
