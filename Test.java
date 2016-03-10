import java.util.Scanner;

/**
 * Created by Nathan on 2/24/2016.
 */
public class Test {


    private int ID1 = 0;
    private int ID2 = 0;
    private String name1 ="";
    private String name2 ="";
    private String SE150NAME ="SE basic JAVA";
    private String SE160NAME ="SE intermediate JAVA";
    private String SE210NAME ="SE basic C++";
    private String SE220NAME ="SE intermediate C++";
    private int tempX = 1;
    private Scanner Input= new Scanner(System.in);
    private boolean tempBool =  false;
    private BinaryTree CourseList = new BinaryTree();
    private Course SE150 = new Course(150, SE150NAME);
    private Course SE160 = new Course(160, SE160NAME);
    private Course SE210 = new Course(210, SE210NAME );
    private Course SE220 = new Course(220, SE220NAME);


    public Test() {

    }//end Student Constructor base

    public void SetupMenu(){

        //fill the CourseList for testing
        CourseList.addNode(150,SE150NAME);
        CourseList.addNode(160,SE160NAME);
        CourseList.addNode(210, SE210NAME);
        CourseList.addNode(220, SE220NAME);

        System.out.println("Pleas enter Your name:");
        name1 = Input.nextLine();
        System.out.println("Pleas enter your student number:");
        ID1 = Input.nextInt();
        System.out.println( name1 + " " + ID1);
        Student S2 = new Student(ID1,name1);


    }

    public void RunMenu(){


    //in this loop go through the menue and allow the user to enter their name student number
    //Second let the user look at a list of courses
    // and third add let the student add up to 4 courses

    do{
        System.out.printf("Pleas pay attian as our menu has changed%n" +
                "1: course list%n" +
                "2: add course%n" +
                "3: delete course%n" +
                "4: check course roster%n" +
                "0: To exit the program%n" +
                ":");
        tempX = Input.nextInt();
        switch(tempX)
        {

            case 1:
                CourseList.inorder(CourseList.root);
                break;
            case 2:
                System.out.printf("Witch course would you register for %n" +
                        "1.SE150: %s%n" +
                        "2.SE160: %s%n" +
                        "3.SE210: %s%n" +
                        "4.SE220: %s%n", SE150NAME,SE160NAME,SE210NAME,SE220NAME);
                ID2 = Input.nextInt();
                //use a switch in order to use Add a student to each course
                switch (ID2){
                    case 1:
                        SE150.AddStudent(name1,ID1);
                        break;
                    case 2:
                        SE160.AddStudent(name1,ID1);
                        break;
                    case 3:
                        SE210.AddStudent(name1,ID1);
                        break;
                    case 4:
                        SE220.AddStudent(name1,ID1);
                        break;
                }//end inner switch
                break;
            case 3:
                System.out.printf("Witch course would you remove %n" +
                        "1.SE150: %s%n" +
                        "2.SE160: %s%n" +
                        "3.SE210: %s%n" +
                        "4.SE220: %s%n", SE150NAME,SE160NAME,SE210NAME,SE220NAME);
                ID2 = Input.nextInt();
                //use a switch in order to use Add a student to each course
                switch (ID2){
                    case 1:
                        SE150.RemoveStudent(name1,ID1);
                        break;
                    case 2:
                        SE160.RemoveStudent(name1,ID1);
                        break;
                    case 3:
                        SE210.RemoveStudent(name1,ID1);
                        break;
                    case 4:
                        SE220.RemoveStudent(name1,ID1);
                        break;
                }//end inner switch
            case 4:
                SE150.conDisplay();
                SE160.conDisplay();
                SE210.conDisplay();
                SE220.conDisplay();
                break;
            //use this for testing the program
            case 5:
                tempBool= true;
                tempX = 5;
                break;
        }//end switch



    } while(tempX != 0 || tempX != 5);

    //    return tempBool ;

    }//end RunMenu

    // Run trough a for loop in add students to a list and check
    public boolean TestMenu(){

        return tempBool;
    }//end TesMenu


}//end class test
