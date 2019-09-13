package officePractice;
import java.lang.reflect.Field;

public class ReflectionTest {
public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
ReflectionHelperBean bean=new ReflectionHelperBean();
/*  Field[] fields = ReflectionHelperBean.class.getFields();
  fields[0].setAccessible(true);
  System.out.println(fields[0].getInt(bean))*/;
  
  /*Field[] fields = ZOrder.class.getFields();
  for (Field field : fields) {
    int modifiers = field.getModifiers();
    if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)
        && field.getType().isAssignableFrom(String.class)) {
      orderTypeToNameMap.put(field.get(String.class).toString(), field.getName());
    }
  }*/
  
  Field declaredField = ReflectionHelperBean.class.getDeclaredField("i");
  declaredField.setAccessible(true);
  int value=(int)declaredField.getInt(bean);
  System.out.println(value);
  
}
}
