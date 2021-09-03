package com.GreatLearning.Assignments.Graded1;
public class Main{
    public static void main(String[] args) {
        //declaring objects of HrDepartment,TechDepartment,AdminDepartment class.

        HrDepartment myHrDepobj = new HrDepartment();
        TechDepartment myTechDepobj = new TechDepartment();
        AdminDepartment myAdminDepobj = new AdminDepartment();


        System.out.println("welcome to"+ myAdminDepobj.departmentname());
        System.out.println(myAdminDepobj.getTodaysWork());
        System.out.println(myAdminDepobj.getWorkDeadline());
        System.out.println(myAdminDepobj.isTodayAHoliday());


        System.out.println("welcome to"+myHrDepobj.departmentname());
        System.out.println(myHrDepobj.doActivity());
        System.out.println(myHrDepobj.getTodaysWork());
        System.out.println(myHrDepobj.getWorkDeadline());
        System.out.println(myHrDepobj.isTodayAHoliday());

        System.out.println("welcome to"+myTechDepobj.departmentname());
        System.out.println(myTechDepobj.getTodaysWork());
        System.out.println(myTechDepobj.getWorkDeadline());
        System.out.println(myTechDepobj.getTechStackInformation());
        System.out.println(myTechDepobj.isTodayAHoliday());
        


    }
}
