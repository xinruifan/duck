package test;

import domain.duck;
import duckEnum.duckColorEnum;
import duckInterface.doukInterfaceImp;

public class main {

    public static  void main(String args[]){
        doukInterfaceImp duckAction = new doukInterfaceImp();
        duck duck_1=new duck("天鹅",duckColorEnum.YELLOW);
        System.out.printf(duck_1.toString());
        duckAction.run();
    }
}
