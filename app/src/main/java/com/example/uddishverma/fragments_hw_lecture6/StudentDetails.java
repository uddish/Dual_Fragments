package com.example.uddishverma.fragments_hw_lecture6;

import java.util.ArrayList;

/**
 * Created by UddishVerma on 29/06/16.
 */
public class StudentDetails {

    public static class studentDetails  {

        String name, skills;
        int photoId, studentId;


        public studentDetails(String name, String skills, int photoId, int studentId) {
            this.name = name;
            this.skills = skills;
            this.photoId = photoId;
            this.studentId = studentId;
        }
    }

    public static ArrayList<studentDetails> getDetails()    {
        ArrayList<studentDetails> details = new ArrayList<>(10);
        details.add(new studentDetails("UDDISH VERMA", "ANDROID DEVELOPER", R.drawable.uddish1, 1));
        details.add(new studentDetails("MOHIT KUMAR", "NOOBIE", R.drawable.mohit, 2));
        details.add(new studentDetails("ARINDAM MALIK", "FULL STACK DEV", R.drawable.arindam, 3));
        details.add(new studentDetails("RUSHIL KHATTAR", "NOOBIE", R.drawable.rushil, 4));
        details.add(new studentDetails("MAYANK AGGARWAL", "ANDROID DEVELOPER",R.drawable.mayank, 5));
        details.add(new studentDetails("SHOURYA MALIK", "ENDFRAME DEVELOPER", R.drawable.shourya, 6));
        details.add(new studentDetails("SAMARTH SINGH", "WEB DEVELOPER", R.drawable.samarth, 7));
        return details;
    }
}
