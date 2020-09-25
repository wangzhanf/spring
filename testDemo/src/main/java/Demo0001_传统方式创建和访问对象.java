/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/9/25 0025
 * @描述
 */
public class Demo0001_传统方式创建和访问对象 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("wangzhanf");
        person.setAge(18);
        System.out.println(person);
    }
}
