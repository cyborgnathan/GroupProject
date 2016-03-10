/**
 * Created by Nathan on 2/22/2016.
 */
public class Student {


    //Declarations
    private int studentID;
    private int courseTotal;
    private String studentName;
    BinaryTree CourseList = new BinaryTree();
    //Constructor base
    public Student() {

        //initialize all variable
        setStudentID(0);
        courseTotal = 0;
        studentName = "";

    }//end Student Constructor base

    //Constructor full
    public Student(int studentID, String studentName) {

        //initialize all variable
       setStudentID(studentID);
        courseTotal = 0;
       setStudentName(studentName);

    }//end Student Constructor full


    public int getStudentID(){
        return studentID;
    }//end getStudentID
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }//end setStudentID

    public String getStudentName(){
        return studentName;
    }//end getCarModle
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }//end setStudentName

    //this need to add a course to our students course LinkedList
    public void AddCourse(String name, int ID){
        if(courseTotal<=4) {
            CourseList.addNode(ID, name);
            courseTotal++;
        }//end if
        else{
            System.out.println("You are already entered for the maximum number of courses please remove a course");
        }//end else
    }// end AddCourse

    //this removes a course by its name
    public void RemoveCourse(String name, int ID){
            CourseList.deleteByMerging(ID);
            courseTotal--;

    }// end RemoveCourse

    public void conDisplay(){
        CourseList.inorder(CourseList.root);
    }//end conDisplay

}//end class student