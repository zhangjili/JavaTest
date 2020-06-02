package fastJsonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonTest {

    public static void main(String[] args) {
        objectToString();
        System.out.println("===============================================================================");
        StringToString();
        System.out.println("===============================================================================");
        stringToObject();
    }

    //调用toJSONString方 法即可将对象转换成 JSON 字符串，parseObject 方法则反过来将 JSON 字符串转换成对象。
    private static void objectToString(){
        List<Person> listOfPersons = new ArrayList<Person>();
        listOfPersons.add(new Person(15, "san","zhang", new Date()));
        listOfPersons.add(new Person(20, "si","li", new Date()));
        String jsonOutput= JSON.toJSONString(listOfPersons);
        System.out.println(jsonOutput);
    }

    private static void StringToString(){
        //我们可以把JSONObject 当成一个 Map<String,Object> 来看
//        //同样我们可以把 JSONArray 当做一个 List<Object>
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < 2; i++) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("AGE", 10);
            jsonObject.put("FULL NAME", "Doe " + i);
            jsonObject.put("DATE OF BIRTH", "2016/12/12 12:12:12");
            jsonArray.add(jsonObject);
        }
        String jsonOutput = jsonArray.toJSONString();
        System.out.println(jsonOutput);

    }

    private static void stringToObject(){
        Person person = new Person(20, "John", "Doe", new Date());
        String jsonObject = JSON.toJSONString(person);
        Person newPerson = JSON.parseObject(jsonObject, Person.class);
        System.out.println(jsonObject);
        System.out.println(newPerson);
        System.out.println(newPerson.getFirstName());
    }


}





