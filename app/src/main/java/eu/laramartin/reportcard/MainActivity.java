package eu.laramartin.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard studentOne = new ReportCard(12345);

        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Maths");
        subjectsList.add("Ojective-C");
        subjectsList.add("Android Developement");
        subjectsList.add("Data Structures");
        subjectsList.add("Artificial Intelligence");

        studentOne.setSubjects(subjectsList);

        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(8);
        gradesList.add(5);
        gradesList.add(10);
        gradesList.add(7);
        gradesList.add(3);

        studentOne.setGrades(gradesList);

        List<Integer> attendanceList = new ArrayList<>();
        attendanceList.add(190);
        attendanceList.add(170);
        attendanceList.add(200);
        attendanceList.add(180);
        attendanceList.add(140);

        studentOne.setAttendance(attendanceList);

        String messageToParents = "Have a great summer!";
        studentOne.setMessageToParents(messageToParents);

        Log.v("MainActivity", "studentOne: " + studentOne);
    }

}
