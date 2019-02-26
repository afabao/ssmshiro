import com.afabao.common.utils.Md5Util;
import org.junit.Test;

public class Md5Test {

    @Test
    public void testM(){
        System.out.println(Md5Util.md5("123456", "juechuang").toString());
    }
}
