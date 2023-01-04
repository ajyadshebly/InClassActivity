package com.example.inclassactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnSaveOnClick(View view) {
        Book[] books = new Book[2];
        books[0] = new Book("Java Core", "John , 1000");
        books[1] = new Book("C# in a Nutshell", "Mark , 1000");

        // Book book = new Book("Professional C#", "Samer");

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String booksString = gson.toJson(books);

        editor.putString("123", booksString);
        editor.commit();
        Toast.makeText(this, "Data Saved:\n" + booksString,
                Toast.LENGTH_SHORT).show();


    }

    public void btnLoadOnClick(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("123", "");
        Book[] books = gson.fromJson(str, Book[].class);

        Toast.makeText(this, "number of books" + books.length
                , Toast.LENGTH_SHORT).show();
    }
}