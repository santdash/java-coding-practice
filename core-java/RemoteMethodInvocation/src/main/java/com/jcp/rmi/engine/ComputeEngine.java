package com.jcp.rmi.engine;

import com.jcp.rmi.compute.Compute;
import com.jcp.rmi.compute.Task;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ComputeEngine implements Compute {
    @Override
    public <T> T executeTask(Task<T> task) throws RemoteException {
        return task.execute();
    }

    public static void main(String[] args) throws RemoteException {
        if (System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }

        String name = "Compute";
        ComputeEngine engine = new ComputeEngine();
        Compute stub = (Compute) UnicastRemoteObject.exportObject(engine, 0);
        Registry registry = LocateRegistry.getRegistry();
        registry.rebind(name, stub);
        System.out.println("Compute engine bound");
    }
}
