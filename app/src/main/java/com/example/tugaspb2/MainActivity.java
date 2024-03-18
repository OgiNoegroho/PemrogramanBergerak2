package com.example.tugaspb2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycleview);


        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Nama: Abmi Sukma Edri","Nim: 1205012o0341",R.drawable.abmi));
        items.add(new Item("Nama: Ahmad Kurniawan","Nim: 12250111514",R.drawable.ahmad));
        items.add(new Item("Nama: Aufa Hajati","Nim: 12250120338",R.drawable.aufa));
        items.add(new Item("Nama: Daffa Finanda","Nim: 12250111603",R.drawable.dapin));
        items.add(new Item("Nama: Daffa Ikhwan Nurfauzan","Nim: 12250110979",R.drawable.dafa));
        items.add(new Item("Nama: Dwi Jelita Adhliyah","Nim: 12250120331",R.drawable.jelita));
        items.add(new Item("Nama: Dwi Mahdini","Nim: 12250111298",R.drawable.dwik));
        items.add(new Item("Nama: Fajri","Nim: 1225011082",R.drawable.fajri));
        items.add(new Item("Nama: Fakhri","Nim: 12250111381",R.drawable.fakhri));
        items.add(new Item("Nama: Farras Lathief","Nim: 12250111328",R.drawable.farras));
        items.add(new Item("Nama: Gilang Ramadhan Indra","Nim: 12250111323",R.drawable.gilang));
        items.add(new Item("Nama: Hafidz Alhadid Rahman","Nim: 12250111794",R.drawable.hafidz));
        items.add(new Item("Nama: Haritsah Naufaldy","Nim: 12250110361",R.drawable.aldy));
        items.add(new Item("Nama: M. Nabil Dawami","Nim: 12250111527",R.drawable.nabil));
        items.add(new Item("Nama: M. Zaki Erbay Syas","Nim: 12250111134",R.drawable.zaki));
        items.add(new Item("Nama: Muhammad Aditya Rinaldi","Nim: 12250111048",R.drawable.adit));
        items.add(new Item("Nama: Muhammad Dhimas Hadid","Nim: 12250111231",R.drawable.dimas));
        items.add(new Item("Nama: Muhammad Faruq","Nim: 12250111791",R.drawable.faruqhz));
        items.add(new Item("Nama: Muhammad Rafly Wirayudha","Nim: 12250111489",R.drawable.rafly));
        items.add(new Item("Nama: Nurika Dwi Wahyuni","Nim: 12250120360",R.drawable.nurika));
        items.add(new Item("Nama: Ogya Secio Noegroho.s","Nim: 12250111346",R.drawable.ogi));
        items.add(new Item("Nama: Rahma Laksita","Nim:12250124357",R.drawable.rahma));
        items.add(new Item("Nama: Surya Hidayatullah Firdaus","Nim: 12250111759",R.drawable.surya));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}