package com.jcp.rmi.client;

import com.jcp.rmi.compute.Compute;
import com.jcp.rmi.compute.Task;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ComputeSum {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        if ( System.getSecurityManager() == null ){
            System.setSecurityManager(new SecurityManager());
        }

        Registry registry = LocateRegistry.getRegistry(args[0]);
        Compute compute = (Compute) registry.lookup("Compute");
        Task<Integer> sumTask = new SumTask(5, 20);
        Integer result = compute.executeTask(sumTask);
        System.out.println("Sum: " + result);
    }
}
