package com.laioffer.lma.adapter;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.laioffer.lma.R;
import com.laioffer.lma.model.Machine;

import java.util.List;

public class WasherAdapter extends RecyclerView.Adapter<WasherAdapter.ViewHolder> {
    private List<Machine> washers;
    Machine user_machine;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            txtHeader = (TextView) v.findViewById(R.id.washer_sn);
            txtFooter = (TextView) v.findViewById(R.id.washer_status);
        }


    }



    // Provide a suitable constructor (depends on the kind of dataset)
    public WasherAdapter(List<Machine> washers) {
        this.washers = washers;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public WasherAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.washer_list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element\
        final String name = washers.get(position).getSN();
        final String status = washers.get(position).getIsAvailable() == "true" ? "Available" : "In use";
        if(washers.get(position).getIsAvailable() == "false") {
            holder.txtFooter.setTextColor(Color.parseColor("#0C1215"));

        }
        holder.txtHeader.setText("ID: " + name);
        holder.txtFooter.setText(status);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return washers.size();
    }
}