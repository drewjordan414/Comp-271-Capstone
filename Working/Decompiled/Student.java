package Working.Decompiled;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Shopper {
   private int studentId;
   private List<Course> registeredCourses = new ArrayList();
   private List<Course> waitListedCourses = new ArrayList();
   private GroceryList groceryList;

   public Student(String firstName, String lastName, int id) {
      super(firstName, lastName);
      this.studentId = id;
      this.groceryList = new GroceryList();
   }

   public int getStudentId() {
      return this.studentId;
   }

   public void addRegisteredCourse(Course course) {
      if (!this.registeredCourses.contains(course)) {
         this.registeredCourses.add(course);
      }

   }

   public void removeCourse(Course course) {
      this.registeredCourses.remove(course);
   }

   public void addWaitListedCourse(Course course) {
      if (!this.waitListedCourses.contains(course)) {
         this.waitListedCourses.add(course);
      }

   }

   public void removeFromWaitList(Course course) {
      this.waitListedCourses.remove(course);
   }

   public List<Course> getRegisteredCourses() {
      return new ArrayList(this.registeredCourses);
   }

   public List<Course> getWaitListedCourses() {
      return new ArrayList(this.waitListedCourses);
   }

   public void createGroceryList() {
      this.groceryList = new GroceryList();
   }

   public void addItemToGroceryList(String itemName, int quantity, GroceryStore store) {
      GroceryItemOrder itemOrder = store.getOrder(itemName, quantity);
      if (itemOrder != null) {
         this.groceryList.add(itemOrder);
      } else {
         System.out.println("Item " + itemName + " could not be added to the list (not found in store).");
      }

   }

   public void viewGroceryList() {
      PrintStream var10000 = System.out;
      String var10001 = this.getFullName();
      var10000.println("Grocery List for " + var10001 + ":\n" + this.groceryList);
   }

   public String toString() {
      String var10000 = this.getFullName();
      return "Student Name: " + var10000 + " | Student ID: " + this.getStudentId();
   }
}

