package com.spacece.libforsmall.DeliveryFoodPanel;

public class DeliveryShipFinalOrders {

    private String OwnerId, BookId, BookName, BookPrice, BookQuantity,RandomUID,TotalPrice,UserId;

    public DeliveryShipFinalOrders(String chefId, String dishId, String dishName, String dishPrice, String dishQuantity, String randomUID, String totalPrice, String userId) {
        OwnerId = chefId;
        BookId = dishId;
        BookName = dishName;
        BookPrice = dishPrice;
        BookQuantity = dishQuantity;
        RandomUID = randomUID;
        TotalPrice = totalPrice;
        UserId = userId;
    }

    public DeliveryShipFinalOrders()
    {

    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(String bookPrice) {
        BookPrice = bookPrice;
    }

    public String getBookQuantity() {
        return BookQuantity;
    }

    public void setBookQuantity(String bookQuantity) {
        BookQuantity = bookQuantity;
    }

    public String getRandomUID() {
        return RandomUID;
    }

    public void setRandomUID(String randomUID) {
        RandomUID = randomUID;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
