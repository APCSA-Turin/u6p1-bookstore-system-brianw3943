package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private static String currentId = 99;
    // //requires one empty constructor
    public IdGenerate() {

    }

    public String getCurrentId(){
        return currentId;
    }

    public void reset(){
        currentId = 99;
    } //must reset the currentId back to 99


    public generateID(){
        int currentIdInt = currentId.parseInt();
        currentIdInt++;
        currentId = currentIdInt;
    } //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
}