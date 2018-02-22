package com.i22works.abdool.muaz.model;

        import java.util.ArrayList;

/**
 * Created by muaz1 on 2018/02/22.
 * class which will contain  data  for  the customer
 */



public class Customer {
    private  String Storname;
    private ArrayList<String> TobbacoBrands= new ArrayList<String>();

    public Customer(String storname, ArrayList<String> tobbacoBrands) {
        Storname = storname;
        TobbacoBrands = tobbacoBrands;
    }
}
