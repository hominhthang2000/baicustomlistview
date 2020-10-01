package com.example.customlistview;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.customlistview.adapter.CustomAdapter;
import com.example.customlistview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv_contact);
        ArrayList<Contact> arrContact = new ArrayList<>();

        Contact contact1 = new Contact("Hồ Minh Thắng","0775551487", Color.RED);
        Contact contact2 = new Contact("Võ Văn Tá","01667 585 545", Color.GREEN);
        Contact contact3 = new Contact("Lê Tấn Dũng","0918 033 033", Color.GRAY);
        Contact contact4 = new Contact("Trương Quang Lâm","0978 102 102", Color.YELLOW);
        Contact contact5 = new Contact("Võ Duy Tính","01667 333 000", Color.BLACK);
        Contact contact6 = new Contact("Trần Văn Toàn","08 999 321", Color.BLUE);
        Contact contact7 = new Contact("Lại Thế Quang","01222 331 331", Color.CYAN);

        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);
        arrContact.add(contact5);
        arrContact.add(contact6);
        arrContact.add(contact7);

        CustomAdapter customAdaper = new CustomAdapter(this, R.layout.row_item, arrContact);
        lvContact.setAdapter(customAdaper);

    }
}
