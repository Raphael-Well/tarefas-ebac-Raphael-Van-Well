/**
 * 
 */
package br.com.rvwell.dao.generic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raphael Van Well
 *
 */
public class SingletonMap {

    private static SingletonMap singletonMap;

    protected Map<Class, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }
    
    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}
