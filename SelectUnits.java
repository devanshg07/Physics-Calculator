import java.util.Scanner; 

class SelectUnits{

public static void showUnit(){//show all of the units that can be selected


System.out.println("1. Kinematics");
System.out.println("2. Dynamics");
System.out.println("3. Energy");
System.out.println("4. Waves");
System.out.println("5. Electricity");
}

//choose the unit that the user wants to use
public static void chooseUnit(){
  Scanner scannerObj = new Scanner(System.in);

int unitChoice = 0;//initialize
System.out.println("Type the number for the unit." + "\n");
showUnit();
unitChoice = scannerObj.nextInt();

Kinematics kinematicsObj = new Kinematics();
  switch(unitChoice){

  case 1:
      kinematicsObj.showEquations();
}
  
}

}