package core.lambdaexpression.collectionvslambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 */
public class LambdaTraditional {

  public static void main(String[] args) {
    List<Staff> list = new ArrayList<>();
    list.addAll(Arrays.asList(
        new Staff(1, "AManhKM"),
        new Staff(2, "FTrangTT"),
        new Staff(3, "BTrangKT")
    ));

    System.out.println("----Trước khi sort----");
    showData(list);

    /*
    Quay về bài toán so thông qua CompareTo 2 Object
     */
//    list.sort(new Comparator<Staff>() {
//      @Override
//      public int compare(Staff o1, Staff o2) {
//        return o1.getName().compareTo(o2.getName());
//      }
//    });

    /**
     * Khi sử dụng dấu ngoặc nhọn trong body của Lambda
     * Return sử dụng dấu ';' để đúng format
     */
    list.sort((o1, o2) -> {
      return o1.getName().compareTo(o2.getName());
    });

    System.out.println("----Sau khi sort----");
    showData(list);
  }

  private static void showData(List<Staff> list) {
    list.forEach(item -> {
      System.out.println(String.format("ID: %s - NAME: %s", item.getId(), item.getName()));
    });
  }


}
