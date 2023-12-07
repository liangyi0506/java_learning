import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liangyi.pojo.User;
import org.apache.commons.lang3.StringUtils;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main (String[] args){
        User user0 = new User("1", "1", "1");
        User user1 = new User("1", "1", "1");
        User user2 = new User("1", "1", "1");
        User user3 = new User("1", "1", "1");
        User user4 = new User("1", "1", "1");
        User user5 = new User("1", "1", "1");

        ArrayList<User> users = new ArrayList<>();
        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        IPage<User> page = new Page<User>().setRecords(users);
        System.out.println(StringUtils.join(page == null ? "null":  page.getRecords()));
    }
}
