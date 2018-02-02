package inf.camp.bso.footballscoring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.LinkedList;

public class MatchList extends AppCompatActivity {

    /*private final LinkedList<String> mMatchListHome = new LinkedList<>();
    private final LinkedList<String> mMatchListAway = new LinkedList<>();
    private int mCount = 0;
    String timkita[] = {"Persib", "Persib", "Persib"};
    String timlawan[] = {"PSM", "Persija", "Persipura"};
    private RecyclerView mRecyclerView;
    private MatchListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_list);

        for (int i = 0; i < 3; i++) {
            mMatchListHome.addLast(timkita[i]);
            mMatchListAway.addLast(timlawan[i]);
            Log.d("WordList", mMatchListHome.getLast());
            Log.d("WordList", mMatchListAway.getLast());
        }
// Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
        mAdapter = new MatchListAdapter(this, mMatchListHome, mMatchListAway);
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }*/


    private final LinkedList<String> mWordList1 = new LinkedList<>();
    private final LinkedList<String> mWordList2 = new LinkedList<>();

    String timkita[] = {"Persija", "Persipura", "Semarang FC"};
    String timlawan[] = {"Persipura", "Persija", "Persipura"};

    private DatabaseHelper mDB;
    private RecyclerView mRecyclerView;
    private MatchListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_list);

        mDB = new DatabaseHelper(this);

        for (int i = 0; i < 3; i++) {
            mWordList1.addLast(timkita[i]);
            mWordList2.addLast(timlawan[i]);
            Log.d("WordList1:", mWordList1.getLast());
            Log.d("WordList2:", mWordList2.getLast());
        }

        //	Get	a	handle	to	the	RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //	Create	an	adapter	and	supply	the	data	to	be	displayed.
        mAdapter = new MatchListAdapter(this, mDB);

        //	Connect	the	adapter	with	the	RecyclerView.
        mRecyclerView.setAdapter(mAdapter);

        //	Give	the	RecyclerView	a	default	layout	manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

}
}
