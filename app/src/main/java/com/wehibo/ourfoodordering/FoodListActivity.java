package com.wehibo.ourfoodordering;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {

    TextView totalView;
    String category;
    ListView listView;
    Button see_cart_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);


          // get intent

        Intent intent = getIntent();

        // intent from MainActivity

        if(intent.getStringExtra("category") != null) {
            category = intent.getStringExtra("category");
        }




//        // intent from DetailActivity
//        if(intent.getDoubleExtra("total", 0.0) != 0.0) {
//
//
//            total += intent.getDoubleExtra("total", 0.0);
//        }
//
        totalView = findViewById(R.id.food_list_total);
        totalView.setText(String.format("%.2f", com.wehibo.ourfoodordering.ShoppingCart.total));
//

        // foodListItems

        ArrayList<Item> foodListItems = new ArrayList<>();

        for(Item item :
                Database.items) {
            if(item.getCategory().equals(category)) {
                foodListItems.add(item);
            }
        }

        // listView

        listView = findViewById(R.id.food_list);

        listView.setAdapter(new com.wehibo.ourfoodordering.ItemAdapter(this, foodListItems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent toDetail = new Intent(getApplicationContext(), DetailActivity.class);
                toDetail.putExtra("item_name", foodListItems.get(position).getName());
                startActivity(toDetail);
            }
        }
);

        // See cart Button

        // connect button to xml element

        see_cart_btn = findViewById(R.id.see_cart_btn);

        //set listener

        see_cart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //init intent, connect to cart activity
                Intent intent = new Intent(getApplicationContext(), com.wehibo.ourfoodordering.CartActivity.class);

               startActivity(intent);

            }
        });

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}