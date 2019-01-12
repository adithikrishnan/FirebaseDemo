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
        setContentView(R.layout.acitvity_main);

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("https://fir-demo-b70e6.firebaseio.com/");
    
        final ArrayList<Word> words = new ArrayList<Word>();
        for(int i=0; <10; i++) { 
            myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                    String value = dataSnapshot.getValue(String.class);
                    words.add(new Word(newPost.name, newPost.age);
            }
        @Override
            public void onCancelled(DatabaseError error) {
            // Failed to read value
            Log.w(TAG, "Failed to read value.", error.toException());
            }
       });

 myRef.addChildEventListener(new ChildEventListener() {
   @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
        Post newPost = dataSnapshot.getValue(Post.class);
        words.add(new Word(newPost.name, newPost.age));
        }
 
     }
     exports.makeUppercase = functions.database.ref("https://fir-demo-b70e6.firebaseio.com/")
    .onCreate((snapshot, context) => {
      // Grab the current value of what was written to the Realtime Database.
      const original = snapshot.val();
      Post newPost = dataSnapshot.getValue(Post.class);
        words.add(new Word(newPost.name, newPost.age));
      
    });

      
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
         
    }

}
