package adithi.com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.util.Log;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("abc", "30");
        words.add(new Word("def", "31");
        words.add(new Word("ghi", "32");
        words.add(new Word("jkl", "33");
        words.add(new Word("mno", "34");
        words.add(new Word("pqr", "35");
        words.add(new Word("stu", "36");
        words.add(new Word("vwx", "37");
        words.add(new Word("yza", "38");
        words.add(new Word("bcd", "39");
        
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
         
    }

}
