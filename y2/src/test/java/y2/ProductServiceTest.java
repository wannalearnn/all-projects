package y2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.visa.training.domain.Product;
import com.visa.training.service.ProductService;

public class ProductServiceTest {

	@Test
	 void test() {
        ProductService service = new ProductService();
        Product p = new Product("testProduct",10000,1) ;
        Product created = service.addNew(p); 
        // here add new  is not a good approach ..
        // its unit testing and we already tested the uao stuff .. i just want to test whether the service layers works or not !! 
        assertNotNull(created) ;
        assertTrue( created.getInd() > 0 );
    }

}
