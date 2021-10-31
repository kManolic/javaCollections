package CollectionClasses;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
        public Collection<String> getObjectsFromCollection(){
            
            Collection<String> collection = new ArrayList<>();
            collection.add("novi string");
            collection.add("ovo je drugi string");
            collection.add("ovo je drugi string");
            Collection<String> newCollection = insertIntoColletion(collection);
            return newCollection;
        } 

        private Collection<String> insertIntoColletion(Collection<String> collection) {
            
            Collection<String> newCollection = new ArrayList<>();
            newCollection.add("ovo je string iz druge metode");
            newCollection.addAll(collection);
            return newCollection;
        }

        public void provjeraUpisa(String upis, Collection<String> collection) {

            if( collection.contains(upis))
            {
                System.out.println("Upisani string postoji");
            }
            else
            {
                System.out.println("Ne postoji upisani string u kolekciji");
            }
        }

        public Collection<String> izbaciObjektIzCollectiona(String string, Collection<String> collection) {

            if (collection.contains(string))
            {
                collection.remove(string);
                return collection;
            }
            else
                return collection;
        }
}
