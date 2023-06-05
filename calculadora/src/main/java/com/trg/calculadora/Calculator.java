/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trg.calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {
    private ScriptEngine engine;

    public Calculator() {
        ScriptEngineManager manager = new ScriptEngineManager();
        engine = manager.getEngineByName("js");
    }

    public double eval(String expression) throws ScriptException {
        Object result = engine.eval(expression);
        if (result instanceof Integer) {
            return (Integer) result;
        } else if (result instanceof Double) {
            return (Double) result;
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }
}