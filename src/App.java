import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Department obj = new Department(1, "Books");

        //Seller seller = new Seller(1, "Bob Brown", "bobbrown@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}
