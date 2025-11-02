package org.example;


import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class ContractFileManager {
    
    public  void  saveContract(Contract contract) {
    try(
        FileWriter writer = new FileWriter("src/main/resources/contract", true))
        {

            if (contract instanceof SalesContract) {
                writer.write("Sales" + contract.toCsvLine() + "\n");
            } else if (contract instanceof LeaseContract) {
                writer.write("Lease" + contract.toCsvLine() + "\n");
            }
            writer.write("\n");
        } catch(
        IOException e)

        {
            System.out.println("Wrong!");
        }

    }

}