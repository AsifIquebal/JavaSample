package com.company.initializationBlocks;

import com.company.constructor.Initials;

public class CallOtherPackageConstructor extends Initials {

    CallOtherPackageConstructor(){
        //super();
        System.out.println("Child...");
    }

    public static void main(String[] args) {
        CallOtherPackageConstructor c = new CallOtherPackageConstructor();
    }

}
