package CollectionClasses;

import java.util.ArrayList;
import java.util.List;

public class ListArrayDemo 
{
        public List<String> createEmptyArrayListWithCapacity(int capacity) {
            List<String> arrayList = new ArrayList<>(capacity);
            return arrayList;
        }

        public boolean isArrayEmpty(List<String> list) {
            return list.isEmpty();
        }

        public int getSizeOfArray(List<String> list) {
            return list.size();
        }
}

