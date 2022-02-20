package com.spacece.libforsmall.CustomerFoodPanel;

import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;

public class Cart {

    private String OwnerId, BookID, BookName, BookQuantity,Price,Totalprice;

    public Cart(String chefId, String dishID, String dishName, String dishQuantity, String price, String totalprice) {
        OwnerId = chefId;
        BookID = dishID;
        BookName = dishName;
        BookQuantity = dishQuantity;
        Price = price;
        Totalprice = totalprice;
    }

    public Cart() {
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookQuantity() {
        return BookQuantity;
    }

    public void setBookQuantity(String bookQuantity) {
        BookQuantity = bookQuantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getTotalprice() {
        return Totalprice;
    }

    public void setTotalprice(String totalprice) {
        Totalprice = totalprice;
    }

    @NonNull
    @NotNull
    @Override
    public String toString() {
        return getOwnerId() + " " + getBookID() + " " + getBookName() + " " + getBookQuantity() + " " + getTotalprice() + " " + getPrice() + "/";
    }
}
