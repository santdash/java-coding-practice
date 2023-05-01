package com.jcp.rmi.compute;

public interface Task<T> {
    T execute();
}
