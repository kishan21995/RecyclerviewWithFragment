package com.app.recyclerviewwithfragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.recyclerviewwithfragment.R;
import com.app.recyclerviewwithfragment.model.YoutubeListData;

import java.util.List;



public class YoutubeListAdapter extends RecyclerView.Adapter<YoutubeListAdapter.MyViewHolder> {
    private List<YoutubeListData> quoteListItem;
    private Context context;
    private MoviesQuotesListInterface moviesQuotesListInterface;///


    public YoutubeListAdapter(List<YoutubeListData> quoteListItem, Context context) {
        this.quoteListItem = quoteListItem;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_items, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {


        final YoutubeListData moviesdata =quoteListItem.get(position);

        holder. quoteText.setText(moviesdata.getQuote());
        holder.writerName.setText(moviesdata.getWriter());


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (moviesQuotesListInterface != null) {
                    moviesQuotesListInterface.moviesQuotesListItem(holder.getAdapterPosition());
                    //moviesQuotesListInterface.moviesQuotesListItem(moviesQuotesList.get(i).getWriterName());
                }


            }
        });

    }


    //Click Listner
    public void setmoviesQuotesListInterface(MoviesQuotesListInterface moviesQuotesListInterface) {    ///
        this.moviesQuotesListInterface = moviesQuotesListInterface;                                 ///
    }
    //Click Listner
    public interface MoviesQuotesListInterface {       ///
        public void moviesQuotesListItem(int position);

    }

    @Override
    public int getItemCount() {
        return quoteListItem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView quoteText,writerName;
        private ImageView imageView;
        private CardView cardView;
        private LinearLayout linearLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            quoteText=itemView.findViewById(R.id.quoteText);
           writerName=itemView.findViewById(R.id.writerName);
            imageView=itemView.findViewById(R.id.imageView);
            linearLayout=itemView.findViewById(R.id.linear);

            //cardView=itemView.findViewById(R.id.cardView);


        }
    }
}
