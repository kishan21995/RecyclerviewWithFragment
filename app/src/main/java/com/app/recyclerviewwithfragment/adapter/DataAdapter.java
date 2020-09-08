package com.app.recyclerviewwithfragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.recyclerviewwithfragment.R;
import com.app.recyclerviewwithfragment.model.Model;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    List<Model> itemList1;

    /*//click lisner
    private MoviesQuotesListInterface moviesQuotesListInterface;///*/

 /*   private SellingListInterface sellingListInterface;*/


    public DataAdapter(List<Model>itemList) {

        this.itemList1=itemList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data_item,parent,false);
         ViewHolder viewHolder=new DataAdapter.ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        holder.itemImage.setImageResource(itemList1.get(position).getImage());
        holder.itemtxt.setText(itemList1.get(position).getName());


  /*      holder.itemImage.setOnClickListener(new View.OnClickListener() {  ////
            @Override
            public void onClick(View view) {
                if (sellingListInterface != null) {
                    //sellingListInterface.sellinglistitem(alllItems.getCatId());
                   sellingListInterface.sellinglistitem(holder.getAdapterPosition());

                }

            }
        });*/


 /*       holder.itemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (moviesQuotesListInterface != null) {
                    moviesQuotesListInterface.moviesQuotesListItem(holder.getAdapterPosition());
                    //moviesQuotesListInterface.moviesQuotesListItem(moviesQuotesList.get(i).getWriterName());
                }


            }
        });*/

    }


 /*   //Click Listner
    public void setmoviesQuotesListInterface(MoviesQuotesListInterface moviesQuotesListInterface) {    ///
        this.moviesQuotesListInterface = moviesQuotesListInterface;                                 ///
    }
    //Click Listner
    public interface MoviesQuotesListInterface {       ///
        public void moviesQuotesListItem(int position);

    }*/

   /* public void setSellingListInterface(SellingListInterface sellingListInterface) {

        this.sellingListInterface = sellingListInterface;
    }*/

    @Override
    public int getItemCount() {
        return itemList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemtxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage=itemView.findViewById(R.id.itemImgg);
            itemtxt=itemView.findViewById(R.id.itemNamee);

        }
    }



/*    public interface SellingListInterface {
        public void sellinglistitem(String id);
    }*/

}
