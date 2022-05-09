package com.jindo.core.race;

/**
 * @author ManhKM on 5/7/2022
 * @project Multi-threading
 */
public class Counter {
    protected long count = 0;

    /**
     * Tăng thêm giá trị value vào giá trị cũ
     */
    public void add(long value){
        this.count = this.count + value;
    }
}
