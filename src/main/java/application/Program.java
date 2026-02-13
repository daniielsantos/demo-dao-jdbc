package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
        Seller seller = new Seller(1,"daniel", "daniel@gmail.com", LocalDate.now(), 3000.00, obj);
        System.out.println("seller "+ seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
