package com.example.android.reportcardapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;

public class ReportCard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// It`s a Report Card used by only one IT teacher, according to Hungarian numerical grading system.

        // Name of the student
        private String mStudentsName;

        // Subjects of the student
        private String mSubjects[];

        // Numeric grades for subjects
        private int mNumericGrades[];

        // Constant is the IT teacher, who is the only admin of this report card.

        private static final String IT_TEACHER = "IT Teacher";

        public ReportCard (int[] numericGrades, String[] subjects, String studentsName) {

            this.mStudentsName = studentsName;
            this.mSubjects = subjects;
            this.mNumericGrades = numericGrades ;
        }

        public String getmStudentsName(){

            return mStudentsName;
        }

        public void setmStudentsName(String studentsName){

            this.mStudentsName = studentsName;
        }

        public int[] getmNumericGrades(){

            return mNumericGrades;
        }

        public void setNumericGrades (int[] NumericGrades){

            this.mNumericGrades = mNumericGrades;
        }

        public String[] getSubjects(){

            return mSubjects;
        }

        public void setSubjects(String[] subjects){

            this.mSubjects = subjects;
        }

        @Override
        public String toString(){

            return "IT Teacher: " + IT_TEACHER + "\n"
                    + "Student`s name: " + mStudentsName + "\n"
                    + "Student`s subjects: " + Arrays.toString(mSubjects) + " " + "Student`s grade: " + Arrays.toString(mNumericGrades);
        }
    }
