package inf.camp.bso.footballscoring;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Lu'lu' on 01/02/2018.
 */

public class MatchListAdapter  extends RecyclerView.Adapter<MatchListAdapter.MatchViewHolder>{
    /*private final LinkedList<String> mMatchListHome;
    private final LinkedList<String> mMatchListAway;
    private LayoutInflater mInflater;
    public MatchListAdapter(Context context, LinkedList<String> matchList1, LinkedList<String> matchList2)
    {
        mInflater = LayoutInflater.from(context);
        this.mMatchListHome = matchList1;
        this.mMatchListAway = matchList2;
    }
    @Override
    public MatchListAdapter.MatchViewHolder onCreateViewHolder(ViewGroup
                                                                     parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.adapter_match_list, parent,
                false);
        return new MatchViewHolder(mItemView, this);
    }
    @Override
    public void onBindViewHolder(MatchViewHolder holder, int position) {
        String mCurrent1 = mMatchListHome.get(position);
        String mCurrent2 = mMatchListAway.get(position);
        holder.matchItemView1.setText(mCurrent1);
        holder.matchItemView2.setText(mCurrent2);
    }

    @Override
    public int getItemCount() {
        return mMatchListHome.size();
    }
    public class MatchViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        public final TextView matchItemView1;
        public final TextView matchItemView2;
        final MatchListAdapter mAdapter;
        public MatchViewHolder(View itemView, MatchListAdapter adapter) {
            super(itemView);
            matchItemView1 = itemView.findViewById(R.id.timkita);
            matchItemView2 = itemView.findViewById(R.id.timlawan);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            String element = mMatchListHome.get(mPosition);
            mMatchListHome.set(mPosition, "Clicked! " + element);
            mAdapter.notifyDataSetChanged();
        }
    }*/

    Context mContext;
    DatabaseHelper mDB;
    private LayoutInflater mInflater;

    public MatchListAdapter(Context context, DatabaseHelper db) {
        mInflater = LayoutInflater.from(context);
        mContext = context;
        mDB = db;
//        this.mWordListHome = wordList1;
//        this.mWordListAway = wordList2;
    }

    @Override
    public MatchListAdapter.MatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.adapter_match_list, parent, false);
        return new MatchViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MatchViewHolder holder, int position) {
        Team current = mDB.query(position);
        holder.wordItemView1.setText(current.getTeamHome());
        holder.wordItemView2.setText(current.getTeamAway());

//        String mCurrent1 = mWordListHome.get(position);
//        String mCurrent2 = mWordListAway.get(position);
//        holder.wordItemView1.setText(mCurrent1);
//        holder.wordItemView2.setText(mCurrent2);
    }

    @Override
    public int getItemCount() {
        return (int) mDB.count();
    }

    public class MatchViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView wordItemView1;
        public final TextView wordItemView2;

        final MatchListAdapter mAdapter;

        public MatchViewHolder(View itemView, MatchListAdapter adapter) {
            super(itemView);
            wordItemView1 = (TextView) itemView.findViewById(R.id.timkita);
            wordItemView2 = (TextView) itemView.findViewById(R.id.timlawan);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            //	Get	the	position	of	the	item	that	was	clicked.
//            int mPosition = getLayoutPosition();
//
//            //	Use	that	to	access	the	affected	item	in	mWordList.
//            String element = mWordListHome.get(mPosition);
//
//            //	Change	the	word	in	the	mWordList.
//            mWordListHome.set(mPosition, "Clicked!	" + element);
//
//            //	Notify	the	adapter,	that	the	data	has	changed	so	it	can
//            //	update	the	RecyclerView	to	display	the	data.
//            mAdapter.notifyDataSetChanged();
        }
    }
}
