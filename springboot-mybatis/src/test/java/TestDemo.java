import org.springframework.beans.factory.annotation.Value;
import org.junit.Test;
/**
 * @Author: jude
 * @Date: Create in 16:59 2018/3/21
 * @Description:
 */
public class TestDemo {
    @Value("${author.realname}")
    private String realname;
    @Value("${author.nickanme}")
    private String nickname;

    @Test
    public void test1(){
        System.out.println(this.realname);
        System.out.println(this.nickname);
    }
}
