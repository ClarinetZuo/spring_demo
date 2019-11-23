package cn.edu.nefu.zjh.entity;

import java.util.*;

/**
 * author:Zuo Junhao
 * NEFU
 */
public class AllCollectionType {

    private List<String> list;
    private String[] array;
    private Set<String> set;
    private Map<String, String> map;
    private Properties props;


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "AllCollectionType{" +
                "list=" + list +
                ", array=" + Arrays.toString(array) +
                ", set=" + set +
                ", map=" + map +
                ", props=" + props +
                '}';
    }
}
