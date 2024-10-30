package Quiz.step1;

import java.util.ArrayList;
import java.util.List;

public class DeptMain2 {
    public static void main(String[] args) {
    List<DeptDTO> list = new ArrayList<>();
    DeptDTO dto2 = new DeptDTO();
    list.add(dto2);
    dto2 = new DeptDTO();
    list.add(dto2);
    dto2 = new DeptDTO();
    list.add(dto2);
    for(DeptDTO dto : list){
        System.out.println(dto);
        }
    }
}
