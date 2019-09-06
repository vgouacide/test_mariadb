package com.company;

import ch.vorburger.exec.ManagedProcessException;


import ch.vorburger.mariadb4j.DB;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;



public class Main {

    public static void main(String[] args) throws ManagedProcessException {
        DBConfigurationBuilder configBuilder = DBConfigurationBuilder.newBuilder();
        configBuilder.setPort(3306); // OR, default: setPort(0); => autom. detect free port
        configBuilder.setDataDir("database"); // just an example
        DB db = DB.newEmbeddedDB(configBuilder.build());
	//  write your code here
//        System.out.println("hello");
        db.start();
        System.out.println("lol");
    }
}
