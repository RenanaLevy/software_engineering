package com.example.tecknet.view.maintenance_man_malfunctions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tecknet.R;
import com.example.tecknet.controller.MaintenanceController;
import com.example.tecknet.model.ProductMalfunctionUser;

import java.util.ArrayList;

public class PEUAdapter extends ArrayAdapter<ProductMalfunctionUser> {
    private Context mContext;
    private  int mResource;
    ArrayList<ProductMalfunctionUser> datalist;

    // constructor for our list view adapter.
    public PEUAdapter(@NonNull Context context,  int resource,ArrayList<ProductMalfunctionUser> dataModalArrayList) {
        super(context, resource, dataModalArrayList);
        mContext = context;
        mResource = resource;
        datalist = dataModalArrayList;
        System.out.println("PEUAdapter con sizr =  " +dataModalArrayList.size());

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // below line is use to inflate the
        // layout for our item of list view.
        LayoutInflater linf = LayoutInflater.from(mContext);
        convertView = linf.inflate(R.layout.single_malfunction_maintenace_display, parent, false);
        System.out.println("PEUAdapter getView");


        // after inflating an item of listview item
        // we are getting data from array list inside
        // our modal class.
        ProductMalfunctionUser peu = getItem(position);

        // initializing our UI components of list view item.

        TextView productTypeTV = convertView.findViewById(R.id.product_maintenance);
        TextView productTV = convertView.findViewById(R.id.device_maintenance);
        TextView companyTV = convertView.findViewById(R.id.company_maintenance);
        TextView malfunctionInfoTV = convertView.findViewById(R.id.malfunction_info_maintenance);
        TextView techInfoTV = convertView.findViewById(R.id.tech_info_maintenance);
        TextView statusTV=convertView.findViewById(R.id.status_maintenance);


        // after initializing our items we are
        // setting data to our view.
        // below line is use to set data to our text view.
        productTypeTV.setText(peu.getProd().getDevice());
        productTV.setText(peu.getProd().getType());
        companyTV.setText(peu.getProd().getCompany());
        malfunctionInfoTV.setText(peu.getMal().getExplanation());
        techInfoTV.setText(MaintenanceController.techString(peu.getUser()));
        statusTV.setText(peu.getMal().getStatus());

        this.notifyDataSetChanged();

        return convertView;
    }
}

