package com.example.timeanddate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    TextView dtView;
    private ListView mylist;
    private ArrayAdapter myAdapter;

    private String[] names={
            "1. ADITYA PRAKASH DUBEY",
            "2. AFREEN",
            "3. AMAN SINGH",
            "4. AMBIKA SINGH",
            "5. AMIT KUMAR",
            "6. AMIT SINGH",
            "7. AMRIT SINGH",
            "8. ANAND CHAUHAN",
            "9. ANJANI BHARATI",
            "10. ANSHIKA DUBEY",
            "11. ANSHU KUMAR VISHWAKARMA",
            "12. ANUJ SHRIVASTAV",
            "13. ARUN KUMAR",
            "14. ARYAN BHARDVAJ",
            "15. ASHISH KUMAR",
            "16. ASHUTOSH YADAV",
            "17. AVINASH KR. VISHWAKARMA",
            "18. AYUSH KUMAR JAISWAL",
            "19. AYUSH TIWARI",
            "20. CHANDAN CHAUDHARI",
            "21. DILIP KUMAR",
            "22. HIMANSHU PATHAK",
            "23. HRITIK KUMAR VISHWAKARMA",
            "24. KR. MAMTA",
            "25. KR. PRATIMA",
            "26. KRISHNA KANT MISHRA",
            "27. NAMAN SHRIVASTAV",
            "28. OMPRAKASH",
            "29. PRIYANKA",
            "30. PRIYANSHU SINGH",
            "31. RAKESH",
            "32. RITESH MISHRA",
            "33. ROHIT KUMAR PATHAK",
            "34. SANTKUMAR",
            "35. SAURABH KUMAR MISHRA",
            "36. SHIVAM KUMAR",
            "37. SIDHARTH",
            "38. SONAM SHARMA",
            "39. SURAJ KUMAR",
            "40. SURAJ KUMAR VISHWAKARMA",
            "41. SURYA BHAN CHAUHAN",
            "42. SUSHAMA",
            "43. TARUN TRIPATHI",
            "44. VARSHA KUMARI",
            "45. VINAY KUMAR",
            "46. VINAYAK AGRAHARI",
            "47. VINEET KUMAR SONI",
            "48. VIPIN SINGH",
            "49. VIVEK GUPTA",
            "50. VIVEK KUMAR MAURYA",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dtView=findViewById(R.id.dtview);
        SimpleDateFormat sdf=new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        String currentDateandTime= sdf.format(new Date());
        dtView.setText(currentDateandTime);

        mylist=findViewById(R.id.listView);
        myAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,names);
        mylist.setAdapter(myAdapter);

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String indexid = "Roll No: "+String.valueOf(position+1);
                Toast.makeText(MainActivity.this, indexid,Toast.LENGTH_SHORT).show();
            }
        });


    }



}