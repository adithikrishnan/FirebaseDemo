package adithi.com.example.android.myapplication;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class WordAdapter extends ArrayAdapter<Word> {
     public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
             }
        
        Word currentWord = getItem(position);

        TextView usernameTextView = (TextView) listItemView.findViewById(R.id.user_name);
        usernameTextView.setText(currentWord.getUsername());
        TextView userageTextView = (TextView) listItemView.findViewById(R.id.user_age);
        userageTextView.setText(currentWord.getUserage());
    
        return listItemView;
    }
}
