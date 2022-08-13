package com.acf.paramtool.models;

import com.acf.paramtool.enums.ParamFormat;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

public class Param<E> {

    private final int NOT_DEFINED = -1;
    private String paramType;
    public Param(Class<E> e) {
        String className = e.getName();
        this.paramType = className;
    }

    public int getParam(String name) {
        try {
            Class<?> clazz = Class.forName(paramType);
            Object[] constants = clazz.getEnumConstants();
            Class<?> sub = constants[0].getClass();
            Method getMatchNameMethod = sub.getDeclaredMethod("getMatchName");
            Method getValueMethod = sub.getDeclaredMethod("getValue");
            return Arrays.stream(constants)
                    .filter(e -> {
                        try {
                            var lists = (List<String>)getMatchNameMethod.invoke(e);
                            return lists.contains(name);
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .map(e -> {
                        try {
                            return (int)getValueMethod.invoke(e);
                        } catch (IllegalAccessException | InvocationTargetException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .findFirst()
                    .orElse(NOT_DEFINED);

        } catch (ClassNotFoundException | NoSuchMethodException exception) {
            exception.printStackTrace();
        }

        return NOT_DEFINED;
    }
}
