package com.chyeseol.homework01;

/**
 * Created by chyeseol on 2018-03-30.
 */

public class Dice{
    private boolean flag;
    private String viewName;
    private int diceNumber;

    public Dice(){
        viewName = "dice_";
        diceNumber = 1;
        flag = true;
    }
    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public boolean getFlag(){
        return flag;
    }

    public String getViewName(int diceNumber){
        return viewName+diceNumber+"_";
    }
}
