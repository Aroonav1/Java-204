import java.util.LinkedList;
public class CourseDBElement
{
   private String id;
   private LinkedList<Integer> courses;
   private int crn;
   private int credits;
   private String roomNum;
   private int courseCount;
   
   public CourseDBElement(java.lang.String word)
   {
     
       courses = new LinkedList<Integer>();
  
  


CourseDBElement(String id, int crn){

this.id = id;

this.crn = crn;

courseCount++;

}



CourseDBElement(String name, int creditHours, int CRN){

this.id = id;

this.credits = credits;

this.crn = crn;

courseCount++;

}



public void setName(String id) {

this.id = id;

}



public void setCredits(int credits) {

this.credits = credits;

}

//set CRN number

public void setcrn(int crn) {

crn = crn;

}

//get  course name

public String getName() {

return id;

}

//get credit hours

public int getCreditHours() {

return credits;

}

//get CRN number

public int getCRN() {

return crn;

}



public String toString(String instructor){

String output="";

output +="Course Name: "+ this.id;

output +=" ," + credits + " Credit Hours, ";

output +="CRN: "+ this.crn + "\n";

if(!instructor.isBlank()){

output += "Instructor: "+ instructor;

}

return output;

}

}





	
	/*public int data1;
		public double data2;
		public CourseDBElement nextLink;

		//Link constructor
		public CourseDBElement (int d1, double d2) {
		data1 = d1;
		data2 = d2;
		}

		//Print data
		public void printLink() {
		System.out.print("{" + data1 + ", " + data2 + "} ");
		}
		}

		class LinkList {
		private CourseDBElement  first;

		//LinkList constructor
		public LinkList() {
		first = null;
		}

		//Returns true if list is empty
		public boolean isEmpty() {
		return first == null;
		}

		

		//Prints list data
		public void printList() {
			CourseDBElement currentLink = first;
		System.out.print("List: ");
		while(currentLink != null) {
		currentLink.printLink();
		currentLink = currentLink.nextLink;
		}
		System.out.println("");
		}
		}

		class LinkListTest {
		public static void main(String[] args) {
		LinkList list = new LinkList();


		list.printList();

		while(!list.isEmpty()) {
			CourseDBElement  deletedLink = list.delete();
		System.out.print("deleted: ");
		deletedLink.printLink();
		System.out.println("");
		}
		list.printList();
		}
		*/

