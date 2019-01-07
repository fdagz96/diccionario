
import com.dao.ModismoDao;
import com.utileria.Modismo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ModismoDaoTest {
    
    public ModismoDaoTest() {
    }
    
    @Test

    public void TestCreate(){  
        Modismo modismo = new Modismo(1, "Fierros", "Unidad de medida de distancia", "Chihuahua");
        ModismoDao modismoDao = new ModismoDao();
        modismoDao.create(modismo);
    }
        

}
