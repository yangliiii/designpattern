package com.yangli.pattern.template;

import java.sql.ResultSet;
import java.util.List;

/**
 * Created by lies on 2018/3/15.
 */
public interface RowMapper<T> {

    public T mapRow (ResultSet rs, int rowNummber) throws Exception;
}
