package gizwits;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.reflect.TypeToken;
import com.jihai.mock.ModelEntity;
import gizwits.generic_test.Address;
import gizwits.generic_test.ApiResponse;
import gizwits.generic_test.Page;
import gizwits.generic_test.Person;
import gizwits.testbean.User;
import org.junit.Test;

/**
 * Created by kevinchen on 2017/10/24.
 */
public class QrcodeTest {

    /**
     * 泛型嵌套的javabean测试
     */
    @Test
    public void testGenericBean(){
        Object resolveBean = new ModelEntity().resolveBean(new TypeToken<ApiResponse<Page<Person<Address>>>>() {
        }.getType());
        print(resolveBean);
    }

    /**
     * 一般的javabean测试
     */
    @Test
    public void testJavaBean(){
        Object resolveBean = new ModelEntity().resolveBean(new TypeToken<User>(){}.getType());
        print(resolveBean);
    }

    /**
     * 打印json结构
     * @param data
     */
    private void print(Object data) {
        System.out.println(JSON.toJSONStringWithDateFormat(data, "YYYY-MM-dd HH:mm:ss", SerializerFeature.PrettyFormat));
    }
}
