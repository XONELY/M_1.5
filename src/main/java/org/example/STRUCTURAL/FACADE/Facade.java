package org.example.STRUCTURAL.FACADE;

public class Facade {
    DataBaseFile dataBaseFile = new DataBaseFile();
    LocalFile localFile = new LocalFile();


    void getData(){
        dataBaseFile.getData();
        localFile.edit();
    }

    void saveData(){
        localFile.save();
        dataBaseFile.update();
    }
}
