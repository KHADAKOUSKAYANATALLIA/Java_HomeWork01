package HomeWork02;
//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.util.HashMap;
import java.util.Map;


public class Task04 {
    public static void main(String[] args) {
        Map<String, String> param = new HashMap<String,String>();
        param.put("name","Ivanov");
        param.put("country","Russia"    );
        param.put("city","Moscow");
        param.put("age","null");
        System.out.println(getQuery(param));
    }
    public static String getQuery(Map<String, String> param)
    {
        StringBuilder string = new StringBuilder();
        for (Map.Entry<String,String> entry : param.entrySet())
        {
            if (entry.getValue() != null)
            {
                string.append(entry.getKey()).append(" = '").append(entry.getValue()).append("' and ");
            }
        }
        string.delete(string.toString().length()-5,string.toString().length());
        return string.toString();
    }
}