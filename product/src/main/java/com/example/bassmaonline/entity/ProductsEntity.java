package com.example.bassmaonline.entity;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name="products")
public class ProductsEntity implements Serializable {

    private static long serialVersionUID;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;
    @NotNull
    private String NameProd;
    @NotNull
    private  String DescProd;
    @NotNull
    private float price;
    @NotNull
    private int quantity;

    @NotNull
    private String photo;




    public Long getIdProd() {
        return idProd;
    }

    public void setIdProd(Long idProd) {
        this.idProd = idProd;
    }

    public String getNameProd() {
        return NameProd;
    }

    public void setNameProd(String nameProd) {
        NameProd = nameProd;
    }

    public String getDescProd() {
        return DescProd;
    }

    public void setDescProd(String descProd) {
        DescProd = descProd;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
