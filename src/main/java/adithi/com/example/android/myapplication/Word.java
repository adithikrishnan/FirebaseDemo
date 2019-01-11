package adithi.com.example.android.myapplication;

public class Word {
    private String mUsername;
    private String mUserage;
    
    public Word(String username, String userage) {
        mUsername = username;
        mUserage = userage;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getUserage() {
        return mUserage;
    }
    
}
