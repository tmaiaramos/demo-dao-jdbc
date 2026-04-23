package model.dao.impl;

import java.util.List;

import model.dao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{
    @Override
    public void insert(Seller obj) {
        System.out.println("Seller inserted! " + obj);
    }

    @Override
    public void update(Seller obj) {
        System.out.println("Seller updated! " + obj);
    }
    
    @Override
    public void deleteById(Integer id) {
        System.out.println("Seller deleted! " + id);
    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }
    

    @Override
    public List<Seller> findAll() {
        return null;
    }

}
