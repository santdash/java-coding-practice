package com.jcp.rmi.client;

import com.jcp.rmi.compute.Task;

import java.io.Serializable;

public class SumTask implements Task<Integer>, Serializable {

    private static final long serialVersionUID = 2432412491L;
    private final Integer num1;
    private final Integer num2;
    public SumTask(Integer num1, Integer num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public Integer execute() {
        return num1 + num2;
    }
}
