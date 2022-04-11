package FlyweightFactory;

import src.Linie;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory<linieMap> {
    Map<Integer, Linie> linieMap;
    linieMap=new HashMap<>()

    public Linie getLinie(Integer nrLinie){
        Linie linieDeReturnat=linieMap.get(nrLinie);
        if(linieDeReturnat != null){
            return linieDeReturnat;
        }
        //
        linieDeReturnat=new Linie(nrLinie,"Prima statie","Utima statie");
 linieMap.put(linieDeReturnat.getNrLinie(),linieDeReturnat);
 return linieDeReturnat;
    }
}
